include boost-debian.inc
include boost.inc

#SRC_URI += "file://arm-intrinsics.patch"
#
# debian
#
inherit debian-package
DEBIAN_SECTION = "libs"
DPR = "0"
DPN = "boost1.55"
SRC_REV="96e3f69cefdc6b7acbbcf3ba931e0fcfd25d6935"