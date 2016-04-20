#
#libxxf86vm_1.1.3.bb
#
SUMMARY = "XFree86-VM: XFree86 video mode extension library"

DESCRIPTION = "libXxf86vm provides an interface to the \
XFree86-VidModeExtension extension, which allows client applications to \
get and set video mode timings in extensive detail.  It is used by the \
xvidtune program in particular."

require xorg-lib-common.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=fa0b9c462d8f2f13eba26492d42ea63d"

DEPENDS += "libxext xf86vidmodeproto"

PE = "1"

XORG_PN = "libXxf86vm"

SRC_URI[md5sum] = "e46f6ee4f4567349a3189044fe1bb712"
SRC_URI[sha256sum] = "da5e86c32ee2069b9e6d820e4c2e4242d4877cb155a2b2fbf2675a1480ec37b8"

#
#debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DEBIAN_PATCH_TYPE = "nopatch"

SRCREV = "fa9d9248c8291a8d7cd2f7824cbab73061ee871a"
