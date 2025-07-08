DESCRIPTION = "RPi4 image with WiFi enabled"
LICENSE = "CLOSED"

SRC_URI = "file://capture.c"


do_compile(){
    ${CC} ${WORKDIR}/capture.c ${LDFLAGS} -o ${WORKDIR}/rasppi4-wifi-esp32cam
}

do_install(){
    # Install the compiled binary to the target directory   
    # install tasna3 dossier 
    install -d ${D}/usr/bin
    install -m 0744 ${WORKDIR}/rasppi4-wifi-esp32cam ${D}/usr/bin  
}

IMAGE_FEATURES += "ssh-server-openssh"



