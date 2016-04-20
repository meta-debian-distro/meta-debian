#
# renderproto_0.11.1.bb
#
require xorg-proto-common.inc

SUMMARY = "XRender: X rendering Extension headers"

DESCRIPTION = "This package provides the wire protocol for the X \
Rendering extension.  This is the basis the image composition within the \
X window system."

LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=f826d99765196352e6122a406cf0d024 \
                    file://renderproto.h;beginline=4;endline=24;md5=3e5e2851dad240b0a3a27c4776b4fd1f"

RCONFLICTS_${PN} = "renderext"
PR = "r1"
PE = "1"

BBCLASSEXTEND = "native nativesdk"

SRC_URI[md5sum] = "a914ccc1de66ddeb4b611c6b0686e274"
SRC_URI[sha256sum] = "06735a5b92b20759204e4751ecd6064a2ad8a6246bb65b3078b862a00def2537"

#
# debian
#
inherit debian-package
DEBIAN_SECTION = "x11"
DPR = "0"
DPN = "x11proto-render"

# There is no debian patch
DEBIAN_PATCH_TYPE = "nopatch"
SRCREV = "d68f3444d76ca848ae5bb26360d31dd54bfaeabe"
