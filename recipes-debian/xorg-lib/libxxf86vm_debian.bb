#
# Base recipe: meta/recipes-graphics/xorg-lib/libxxf86vm_1.1.3.bb
# Base branch: daisy
# 

SUMMARY = "XFree86-VM: XFree86 video mode extension library"

DESCRIPTION = "libXxf86vm provides an interface to the \
XFree86-VidModeExtension extension, which allows client applications to \
get and set video mode timings in extensive detail.  It is used by the \
xvidtune program in particular."

require xorg-lib-common.inc
PV = "1.1.3"

PR = "${INC_PR}.0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=fa0b9c462d8f2f13eba26492d42ea63d"

DEPENDS += "libxext xf86vidmodeproto"

XORG_PN = "libXxf86vm"

#There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"

SRC_REV="fa9d9248c8291a8d7cd2f7824cbab73061ee871a"
