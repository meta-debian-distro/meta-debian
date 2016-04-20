require xorg-proto-common.inc

inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-print"

LIC_FILES_CHKSUM = "file://COPYING;md5=658463213f19b48b81f8672d2696069f"

# no patch found
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "818d1ad6f97d24f1cc0c54c50ecd459e56d7bfac"
