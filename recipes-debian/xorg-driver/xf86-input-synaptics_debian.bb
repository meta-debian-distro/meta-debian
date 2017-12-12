require xorg-driver-input.inc

SUMMARY = "X.Org X server -- synaptics touchpad input driver"

DESCRIPTION = "synaptics is an Xorg input driver for the touchpads from \
Synaptics Incorporated. Even though these touchpads (by default, \
operating in a compatibility mode emulating a standard mouse) can be \
handled by the normal evdev or mouse drivers, this driver allows more \
advanced features of the touchpad to become available."

SRCREV = "934bc0012f948c52aadc8eda912f7728fb7394a2"
PV = "0.15.2+git${SRCPV}"
PR = "${INC_PR}.1"

#SRC_URI = "git://anongit.freedesktop.org/git/xorg/driver/xf86-input-synaptics"
S = "${WORKDIR}/git"

DEPENDS += "libxi mtdev libxtst"

#
# debian
#
LIC_FILES_CHKSUM = "file://COPYING;md5=55aacd3535a741824955c5eb8f061398"

inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "xserver-xorg-input-synaptics"
DEBIAN_PATCH_TYPE = "quilt"

# Fix QA issue file not shipped to any package
FILES_${PN} += "${datadir}"
SRC_REV="3676a6e5b9b12f5e0fe193d6d9fb673d4a31ca97"