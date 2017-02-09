#
# libxrandr_1.4.2.bb
#
SUMMARY = "XRandR: X Resize, Rotate and Reflect extension library"

DESCRIPTION = "The X Resize, Rotate and Reflect Extension, called RandR \
for short, brings the ability to resize, rotate and reflect the root \
window of a screen. It is based on the X Resize and Rotate Extension as \
specified in the Proceedings of the 2001 Usenix Technical Conference \
[RANDR]."

require xorg-lib-common.inc

LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=c9d1a2118a6cd5727521db8e7a2fee69"

DEPENDS += "virtual/libx11 randrproto libxrender libxext"

PE = "1"

XORG_PN = "libXrandr"

BBCLASSEXTEND = "native nativesdk"

SRC_URI[md5sum] = "210ed9499a3d9c96e3a221629b7d39b0"
SRC_URI[sha256sum] = "caa7b31ac769be51a532343c65376f1d4df3f307afaed58e34fb5e82e8b825ad"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "645e7a2b7190f1699e510b18541c6c63a42b0206"
