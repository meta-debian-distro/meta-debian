require recipes-support/gmp/gmp.inc
FILESEXTRAPATHS_prepend = "\
${THISDIR}/files:${COREBASE}/meta/recipes-support/gmp/gmp:\
${COREBASE}/meta/recipes-support/gmp/files:\
"

inherit debian-package
DEBIAN_SECTION = "libs"

DPR = "0"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

#
# configure.patch: Not use from reused recipe since version is different.
# Patch file was created for new version with the same purpose.
# 
# amd64.patch: Patch file from reused recipe.
#
SRC_URI += "\
 file://configure.patch \
 file://amd64.patch \
"
SRCREV = "95126e8801970986ff1848000c634256cadfd502"
