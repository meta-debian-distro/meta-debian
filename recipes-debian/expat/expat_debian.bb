require expat.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=1b71f681713d1256e1c23b0890920874"

SRC_URI[md5sum] = "dd7dab7a5fea97d2a6a43f511449b7cd"
SRC_URI[sha256sum] = "823705472f816df21c8f6aa026dd162b280806838bb55b3432b0fb1fcca7eb86"

#
#Meta-debian
#
inherit debian-package
DPR = "0"
DEBIAN_SECTION = "libs"
SRC_REV="f35078f0c5d2cd7def68479d8901731fb80c20d9"