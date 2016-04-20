include libxcb.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=d763b081cb10c223435b01e00dc0aba7"


DEPENDS += "libxdmcp python"

SRC_URI[md5sum] = "074c335cc4453467eeb234e3dadda700"
SRC_URI[sha256sum] = "98d9ab05b636dd088603b64229dd1ab2d2cc02ab807892e107d674f9c3f2d5b5"

#
# debian
#
inherit debian-package

DEBIAN_SECTION = "x11"
DPR = "0"

SRC_URI += " \
	file://xcbincludedir.patch \
"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "3d8ccbe2e6ade6c45bb5b4c3a983dad928c8898a"
