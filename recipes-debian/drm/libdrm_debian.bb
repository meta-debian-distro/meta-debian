require libdrm.inc

SRC_URI += "file://installtests.patch \
            file://GNU_SOURCE_definition.patch \
           "
SRC_URI[md5sum] = "01b75624a5da3a7543923e54c3547a24"
SRC_URI[sha256sum] = "fa693c2f1f61befcefbdcc396673e38481110bac9db610afa4b8afb2be0218c1"

#
# Meta-debian
#
inherit debian-package
DPR = "0"
DEBIAN_SECTION = "libs"
DEBIAN_PATCH_TYPE = "quilt"
SRCREV = "b3ce78f7bcac92ba4202526ff8b544f9415a83b4"
