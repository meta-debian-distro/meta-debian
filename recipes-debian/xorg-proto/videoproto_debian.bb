#
# videoproto_2.3.2.bb
#
require xorg-proto-common.inc

SUMMARY = "Xv: X Video extension headers"

DESCRIPTION = "This package provides the wire protocol for the X Video \
extension.  This extension alows for accerlated drawing of videos."

LICENSE = "MIT & MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=ce3472a119a864085fa4155cb0979a7b"

PE = "1"

SRC_URI[md5sum] = "e658641595327d3990eab70fdb55ca8b"
SRC_URI[sha256sum] = "8dae168cb820fcd32f564879afb3f24d27c176300d9af66819a18265539bd4b6"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-video"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "09bf51b110c25bac7a9798b0a29ffe2f69ad4315"
