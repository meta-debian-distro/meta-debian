require xserver-xorg.inc

# Misc build failure for master HEAD
SRC_URI += "file://crosscompile.patch \
            file://fix_open_max_preprocessor_error.patch \
            file://mips64-compiler.patch \
            file://aarch64.patch \
            file://xorg-CVE-2013-6424.patch \
           "

SRC_URI[md5sum] = "c2ace3697b32414094cf8c597c39d7d9"
SRC_URI[sha256sum] = "613b2f2e7ee2a06d2f8e862c836dc70d319c52f1537749e027398f40086aabb8"

# These extensions are now integrated into the server, so declare the migration
# path for in-place upgrades.

RREPLACES_${PN} =  "${PN}-extension-dri \
                    ${PN}-extension-dri2 \
                    ${PN}-extension-record \
                    ${PN}-extension-extmod \
                    ${PN}-extension-dbe \
                   "
RPROVIDES_${PN} =  "${PN}-extension-dri \
                    ${PN}-extension-dri2 \
                    ${PN}-extension-record \
                    ${PN}-extension-extmod \
                    ${PN}-extension-dbe \
                   "
RCONFLICTS_${PN} = "${PN}-extension-dri \
                    ${PN}-extension-dri2 \
                    ${PN}-extension-record \
                    ${PN}-extension-extmod \
                    ${PN}-extension-dbe \
                   "
#
#Meta-debian
#
inherit debian-package
DPR = "0"
DPN = "xorg-server"

DEBIAN_PATCH_TYPE = "quilt"

# macro_tweak.patch:
#   correct a include directory path for sysroot
#   Without this patch, do_qa_configure of other X packages
#   that use xorg-server.m4 may fail because of the following warning:
#   "/usr/include/xorg" is unsafe for cross-compilation
SRC_URI += "file://macro_tweak.patch"
SRCREV = "1175313a2caf9fa9117f7dea6440094cf515844a"
