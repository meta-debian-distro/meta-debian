require m4.inc

PR = "r1"

# Avoid warnings treated as error
EXTRA_OECONF += "--disable-gcc-warnings"

BBCLASSEXTEND = "nativesdk"
SRCREV = "af4b2e12005b6ec64868f8e2f803e580e2fc78c7"
