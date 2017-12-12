#
# xineramaproto_1.2.1.bb
#
require xorg-proto-common.inc

SUMMARY = "Xinerama: Xinerama extension headers"

DESCRIPTION = "This package provides the wire protocol for the Xinerama \
extension.  This extension is used for retrieving information about \
physical output devices which may be combined into a single logical X \
screen."

LICENSE = "MIT & MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=3e397a5326c83d5d0ebf5b3f87163ac6 \
                    file://panoramiXproto.h;endline=24;md5=098e0bc089368a988092b3cbda617a57"

PE = "1"

SRC_URI[md5sum] = "9959fe0bfb22a0e7260433b8d199590a"
SRC_URI[sha256sum] = "977574bb3dc192ecd9c55f59f991ec1dff340be3e31392c95deff423da52485b"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-xinerama"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRC_REV="b746160ba7ec36e8fac8195054ec19b81648f19d"