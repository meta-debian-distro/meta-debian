require recipes-graphics/xorg-util/util-macros_1.18.0.bb

DPN = "xutils-dev"

inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=1970511fddd439b07a6ba789d28ff662"

S = "${DEBIAN_UNPACK_DIR}/util-macros"

# alway try to apply debian patches by quilt
DEBIAN_PATCH_TYPE = "quilt"

# Fix QA issue file not shipped to any package
FILES_${PN} += "${datadir}"
SRC_REV="02b3c5a6103d229193778eca9bd0960059d069bc"