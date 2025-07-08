DESCRIPTION = "RPi4 image with WiFi enabled"
LICENSE = "CLOSED"

SRC_URI = "file://capture.c"


do_compile(){
    ${CC} ${WORKDIR}/capture.c ${LDFLAGS} -o ${WORKDIR}/capture
}

do_install(){
    # Install the compiled binary to the target directory    
    install -d ${D}/usr/bin
    install -m 0744 ${WORKDIR}/capture ${D}/usr/bin  
}

IMAGE_FEATURES += "ssh-server-openssh"



