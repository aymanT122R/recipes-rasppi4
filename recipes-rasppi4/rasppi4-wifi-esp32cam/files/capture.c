#include <stdlib.h>

int main() {
    // Call ffmpeg to record 20 seconds from ESP32-CAM stream
    const char *cmd = "ffmpeg -i http://esp32cam.local/stream -t 20 -c copy /media/video.mp4";
    int ret = system(cmd);

    if (ret == -1) {
        perror("system");
        return 1;
    }

    return 0;
}
