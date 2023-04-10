package chap_07;

import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        FactoryCam factorycam = new FactoryCam();
        SpeedCam speedcam = new SpeedCam();

        factorycam.recordVideo();
        System.out.println("-------------------");
        speedcam.takePicture();
    }
}
