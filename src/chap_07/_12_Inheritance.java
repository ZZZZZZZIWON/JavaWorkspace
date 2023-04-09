package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCam factorycam = new FactoryCam();
        SpeedCam speedcam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factorycam.name);
        System.out.println(speedcam.name);

        camera.takePicture();
        factorycam.recordVideo();
        speedcam.takePicture();

        factorycam.detectFire();
        speedcam.checkSpeed();
        speedcam.recognizeLicensePlate();
    }


}
