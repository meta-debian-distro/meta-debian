#
# Base recipe: meta/recipes-graphics/xorg-app/xinput_1.6.1.bb
# Base branch: daisy
#

SUMMARY = "Runtime configuration and test of XInput devices"

DESCRIPTION = "Xinput is an utility for configuring and testing XInput devices."

require xorg-app-common.inc
PV = "1.6.1"

PR = "${INC_PR}.0"

inherit autotools

LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=881525f89f99cad39c9832bcb72e6fa5"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"

DEPENDS += "libxi libxrandr libxinerama"
SRC_REV="f7ba4478c368a34910a59f0b31d82d2c39fa386b"
