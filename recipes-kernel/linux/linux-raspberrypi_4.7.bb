FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.7.10"

SRCREV = "e7fa325a40f260ed9fb86391a0b65150eba8c112"
SRC_URI = "git://github.com/raspberrypi/linux.git;protocol=git;branch=rpi-4.7.y \
           file://0001-fix-dtbo-rules.patch \
"
SRC_URI_append_raspberrypi3-64 = " file://0002-support-64bits.patch"

require linux-raspberrypi.inc
