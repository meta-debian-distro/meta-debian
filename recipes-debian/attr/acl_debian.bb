#
# base recipe: meta/recipes-support/attr/acl_2.2.52.bb
# base branch: daisy
#

require ea-acl.inc
PV = "2.2.52"
PR = "r0"

LICENSE = "LGPLv2.1+ & GPLv2+"
LICENSE_${PN} = "GPLv2+"
LICENSE_lib${DPN} = "LGPLv2.1+"
LIC_FILES_CHKSUM = " \
	file://doc/COPYING;md5=c781d70ed2b4d48995b790403217a249 \
	file://doc/COPYING.LGPL;md5=9e9a206917f8af112da634ce3ab41764 \
"

DEPENDS = "attr"

SRC_URI += " \
	file://run-ptest \
	file://acl-fix-the-order-of-expected-output-of-getfacl.patch \
	file://add-missing-configure.ac.patch \
	file://relative-libdir.patch;striplevel=0 \
"

# avoid RPATH hardcode to staging dir
do_configure_append() {
	sed -i ${S}/config.status -e s,^\\\(hardcode_into_libs=\\\).*$,\\1\'no\',
	${S}/config.status
}

# libdir should point to .la
do_install_append() {
	sed -i ${D}${libdir}/libacl.la -e \
		s,^libdir=\'${base_libdir}\'$,libdir=\'${libdir}\',
}

inherit ptest

do_install_ptest() {
	tar -cf - test/ --exclude nfs | ( cd ${D}${PTEST_PATH} && tar -xf - )
	mkdir ${D}${PTEST_PATH}/include
	cp ${S}/include/builddefs ${S}/include/buildmacros ${S}/include/buildrules ${D}${PTEST_PATH}/include/
}

RDEPENDS_${PN}-ptest = "bash coreutils perl perl-module-filehandle perl-module-getopt-std perl-module-posix shadow"

BBCLASSEXTEND = "native nativesdk"
SRC_REV="83f8763f36ab7d42a0feb13af8c7e383a2692671"
