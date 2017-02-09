require xorg-driver-input.inc

SUMMARY = "X.Org X server -- event devices (evdev) input driver"

DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event \
devices. It therefore supports all input devices that the kernel knows \
about, including most mice and keyboards. \
\
The evdev driver can serve as both a pointer and a keyboard input \
device, and may be used as both the core keyboard and the core pointer. \
Multiple input devices are supported by multiple instances of this \
driver, with one Load directive for evdev in the Module section of your \
xorg.conf for each input device that will use this driver. "

LIC_FILES_CHKSUM = "file://COPYING;md5=fefe33b1cf0cacba0e72e3b0fa0f0e16"

DEPENDS += "mtdev libevdev"

SRC_URI[md5sum] = "8f73a98e32dccc9d054b54727cc4093f"
SRC_URI[sha256sum] = "0ce30328adfeac90a6f4b508d992fb834d8e50b484b29d3d58cf6683fa8502f9"

#
#Meta-debian
#
inherit debian-package
DPR = "0"
DPN = "xserver-xorg-input-evdev"
DEBIAN_PATCH_TYPE = "quilt"
SRCREV = "364c9efd2a88018df1e90cda4de9f19b5e3a7f03"
