require recipes-gnome/libffi/libffi_3.0.13.bb
FILESEXTRAPATHS_prepend = "${COREBASE}/meta/recipes-gnome/libffi/libffi:"

inherit debian-package

DEBIAN_SECTION = "libs"
DPR = "0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3610bb17683a0089ed64055416b2ae1b"

SRC_URI += " \
file://fix-libffi.la-location.patch \
"
SRCREV = "cc85a55b6dbf7a3b7f5f5c7e1cf7b8e933968cf7"
