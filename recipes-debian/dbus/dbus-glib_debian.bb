require dbus-glib.inc


SRC_URI[md5sum] = "ad0920c7e3aad669163bb59171cf138e"
SRC_URI[sha256sum] = "a5bb42da921f51c28161e0e54a5a8241d94a1c0499a14007150e9ce743da6ac5"

#
# Meta-debian
#
inherit debian-package
DEBIAN_SECTION = "devel"
DPR = "0"
SRC_REV="696d85ca3cbf2e5f1e71d361708930843fec0cdf"