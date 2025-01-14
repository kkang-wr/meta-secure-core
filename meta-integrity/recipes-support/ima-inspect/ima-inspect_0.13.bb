LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a23a74b3f4caf9616230789d94217acb"

DEPENDS += "attr ima-evm-utils tclap"

SRC_URI = " \
    git://github.com/mgerstner/ima-inspect.git;branch=master;protocol=https \
    file://0001-ima_helpers-add-missing-stdint.h-include.patch \
"
SRCREV = "90f395c84eff54c69ba9ee078274313cfd308b53"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
