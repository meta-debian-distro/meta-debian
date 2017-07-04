#
# xf86dgaproto_2.1.bb
#
require xorg-proto-common.inc

SUMMARY = "XFree86-DGA: XFree86 Direct Graphics Access extension headers"

DESCRIPTION = "This package provides the wire protocol for the XFree86 \
Direct Graphics Access extension. This extension allows direct graphics \
access to a framebuffer-like region, as well as relative mouse \
reporting."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=e01e66e4b317088cf869bc98e6af4fb6"

RCONFLICTS_${PN} = "xxf86dgaext"
PR = "r2"
PE = "1"

SRC_URI[md5sum] = "a036dc2fcbf052ec10621fd48b68dbb1"
SRC_URI[sha256sum] = "ac5ef65108e1f2146286e53080975683dae49fc94680042e04bd1e2010e99050"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-xf86dga"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "0cdc0e86f26853ae55e96f49218eee6ae653fc7c"
