#
# xf86-video-vesa_2.3.3.bb
#
require xorg-driver-video.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a1f0610ebdc6f314a9fa5102a8c5c1b0"

SUMMARY = "X.Org X server -- Generic Vesa video driver"

DESCRIPTION = "vesa is an Xorg driver for generic VESA video cards. It \
can drive most VESA-compatible video cards, but only makes use of the \
basic standard VESA core that is common to these cards. The driver \
supports depths 8, 15 16 and 24."

PR = "${INC_PR}.0"

DEPENDS += "virtual/libx11 randrproto libpciaccess"

COMPATIBLE_HOST = '(i.86|x86_64).*-linux'

RRECOMMENDS_${PN} += "xserver-xorg-module-libint10"

SRC_URI[md5sum] = "3690a5356ed121b1a7dfb59a6dcf4bf9"
SRC_URI[sha256sum] = "ce8b75e5a40e9dae76f2ac9e2880f7f73a848653ca2eed5880f52dc2c0d3aef8"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "xserver-xorg-video-vesa"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"

LICENSE = "MIT-style"

INC_PR = "r0"
SRC_REV="549751fb6013cac80b30384254498b1de8ce9538"