package chap_07.Camera;

public class Camera { // 부모 클래스
    public String name;

    public Camera() {
        this("카메라");
    }

    protected Camera(String name) { // 자식클래스에서 이용 가능
        this.name = name;
    }
    public void takePicture() {
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }
}
