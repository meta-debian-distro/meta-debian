#
# base recipe: meta/recipes-core/gettext/gettext_0.18.3.2.bb
# base branch: daisy
#

PR = "0"

inherit debian-package
PV = "0.19.3"

SUMMARY = "Utilities and libraries for producing multi-lingual messages"
DESCRIPTION = "GNU gettext is a set of tools that provides a framework to help other programs produce multi-lingual messages. These tools include a set of conventions about how programs should be written to support message catalogs, a directory and file naming organization for the message catalogs themselves, a runtime library supporting the retrieval of translated messages, and a few stand-alone programs to massage in various ways the sets of translatable and already translated strings."

LICENSE = "GPLv3+ & LGPL-2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gettext-native virtual/libiconv expat"
DEPENDS_class-native = "gettext-minimal-native"
PROVIDES = "virtual/libintl virtual/gettext"
PROVIDES_class-native = "virtual/gettext-native"
RCONFLICTS_${PN} = "proxy-libintl"

PACKAGECONFIG[msgcat-curses] = "--with-libncurses-prefix=${STAGING_LIBDIR}/..,--disable-curses,ncurses,"

LDFLAGS_prepend_libc-uclibc = " -lrt -lpthread "

inherit autotools

EXTRA_OECONF += "--without-lispdir \
                 --disable-csharp \
                 --disable-libasprintf \
                 --disable-java \
                 --disable-native-java \
                 --disable-openmp \
                 --disable-acl \
                 --with-included-glib \
                 --without-emacs \
                 --without-cvs \
                 --without-git \
                 --with-included-libxml \
                 --with-included-libcroco \
                 --with-included-libunistring \
                "

acpaths = '-I ${S}/gettext-runtime/m4 \
           -I ${S}/gettext-tools/m4'


# these lack the .x behind the .so, but shouldn't be in the -dev package
# Otherwise you get the following results:
# 7.4M    glibc/images/ep93xx/Angstrom-console-image-glibc-ipk-2008.1-test-20080104-ep93xx.rootfs.tar.gz
# 25M     uclibc/images/ep93xx/Angstrom-console-image-uclibc-ipk-2008.1-test-20080104-ep93xx.rootfs.tar.gz
# because gettext depends on gettext-dev, which pulls in more -dev packages:
# 15228   KiB /ep93xx/libstdc++-dev_4.2.2-r2_ep93xx.ipk
# 1300    KiB /ep93xx/uclibc-dev_0.9.29-r8_ep93xx.ipk
# 140     KiB /armv4t/gettext-dev_0.14.1-r6_armv4t.ipk
# 4       KiB /ep93xx/libgcc-s-dev_4.2.2-r2_ep93xx.ipk

PACKAGES =+ "libgettextlib libgettextsrc"
FILES_libgettextlib = "${libdir}/libgettextlib-*.so*"
FILES_libgettextsrc = "${libdir}/libgettextsrc-*.so*"

PACKAGES =+ "gettext-runtime gettext-runtime-dev gettext-runtime-doc"

FILES_${PN} += "${libdir}/${BPN}/*"

FILES_gettext-runtime = "${bindir}/gettext \
                         ${bindir}/ngettext \
                         ${bindir}/envsubst \
                         ${bindir}/gettext.sh \
                         ${libdir}/libasprintf.so* \
                         ${libdir}/GNU.Gettext.dll \
                        "
FILES_gettext-runtime_append_libc-uclibc = " ${libdir}/libintl.so.* \
                                             ${libdir}/charset.alias \
                                           "
FILES_gettext-runtime-dev += "${libdir}/libasprintf.a \
                      ${includedir}/autosprintf.h \
                     "
FILES_gettext-runtime-dev_append_libc-uclibc = " ${libdir}/libintl.so \
                                                 ${includedir}/libintl.h \
                                               "
FILES_gettext-runtime-doc = "${mandir}/man1/gettext.* \
                             ${mandir}/man1/ngettext.* \
                             ${mandir}/man1/envsubst.* \
                             ${mandir}/man1/.* \
                             ${mandir}/man3/* \
                             ${docdir}/gettext/gettext.* \
                             ${docdir}/gettext/ngettext.* \
                             ${docdir}/gettext/envsubst.* \
                             ${docdir}/gettext/*.3.html \
                             ${datadir}/gettext/ABOUT-NLS \
                             ${docdir}/gettext/csharpdoc/* \
                             ${docdir}/libasprintf/autosprintf.html \
                             ${infodir}/autosprintf.info \
                            "

do_install_append() {
    rm -f ${D}${libdir}/preloadable_libintl.so
}

do_install_append_class-native () {
        rm ${D}${datadir}/aclocal/*
        rm ${D}${datadir}/gettext/config.rpath
        rm ${D}${datadir}/gettext/po/Makefile.in.in
        rm ${D}${datadir}/gettext/po/remove-potcdate.sin
}

BBCLASSEXTEND = "native nativesdk"

# There is no file git-version-gen in released archive, temporarily get 
# current version from ChangeLog with do-not-use-git-version-gen.patch
SRC_URI += " \
file://parallel.patch \
file://do-not-use-git-version-gen.patch \
"
SRC_REV="360269e4876bdf477e3b4ed5b8019ff7208325aa"
