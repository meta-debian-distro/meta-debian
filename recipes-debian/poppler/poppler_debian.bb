SUMMARY = "PDF rendering library"

DESCRIPTION = "PDF rendering library based on Xpdf PDF viewer"

DEPENDS = "fontconfig"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit debian-package autotools pkgconfig
DEBIAN_SECTION = "devel"
DPR = "0"
SRC_REV="c685ffde4f027983d05a8e4994332fe31a03427a"