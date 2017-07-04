#
# libxfont_1.4.7.bb
#
SUMMARY = "XFont: X Font rasterisation library"

DESCRIPTION = "libXfont provides various services for X servers, most \
notably font selection and rasterisation (through external libraries \
such as freetype)."

require xorg-lib-common.inc

LICENSE = "MIT & MIT-style & BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=a46c8040f2f737bcd0c435feb2ab1c2c"

DEPENDS += "freetype xtrans fontsproto libfontenc zlib"
PROVIDES = "xfont"

PE = "1"

XORG_PN = "libXfont"

BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "b21ee5739d5d2e5028b302fbf9fe630b"
SRC_URI[sha256sum] = "d16ea3541835d296b19cfb05d7e64fc62173d8e7eb93284402ec761b951d1543"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "a5a535799743dc7c9398056ec3cfa0db7f3cb1ef"
