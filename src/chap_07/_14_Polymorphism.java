package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성 ( 형태가 다양 )

        // Class Person : 사람
        // Class Student extends Person : 학생 (Student is a person)
        // Class Teacher extends Person : 선생님 (Teacher is a person)

        // Camera camera = new Camera();
        // FactoryCam factorycam = new FactoryCam();
        // SpeedCam speedCam = new SpeedCam();

        Camera camera = new Camera();
        Camera factorycam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factorycam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("----------------------------");

        // 부모 클래스에 있는 메소드만 사용 가능
        // factorycam.detectFire();
        // speedcam.checkspeed();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factorycam instanceof FactoryCam) {
            ((FactoryCam)factorycam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
        }
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}
