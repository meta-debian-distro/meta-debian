SUMMARY = "X11 Athena Widget library"

inherit debian-package autotools
DEBIAN_SECTION = "x11"
PR = "r0"
DPR = "0"
LICENSE = "XFree86-1.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=1c65719d42900bb81b83e8293c20a364"

DEPENDS += "libx11 libxext libxmu libxt libxpm"

DEBIAN_PATCH_TYPE = "quilt"
SRC_REV="f096128a0261d7f654d6832f038cf93048a4ddfe"