require libx11.inc
inherit gettext

BBCLASSEXTEND = "native nativesdk"

SRC_URI += "file://disable_tests.patch \
            file://nls-always-use-XCOMM-instead-of-for-comments-in-Comp.patch \
           "

SRC_URI[md5sum] = "c35d6ad95b06635a524579e88622fdb5"
SRC_URI[sha256sum] = "2aa027e837231d2eeea90f3a4afe19948a6eb4c8b2bec0241eba7dbc8106bd16"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"

# applying debian patch by quilt
DEBIAN_PATCH_TYPE = "quilt"
SRCREV = "4e8e30a0b7a1f8e07f2ab2ffb2f0c0cea753b4a4"
