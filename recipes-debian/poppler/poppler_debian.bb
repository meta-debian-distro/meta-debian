SUMMARY = "PDF rendering library"

DESCRIPTION = "PDF rendering library based on Xpdf PDF viewer"

DEPENDS = "fontconfig"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PR = "r0"

inherit debian-package autotools pkgconfig gettext
PV = "0.26.5"
SRC_REV="683feeef165a7e99f8e74e71f2ba1c17173cf9ec"
