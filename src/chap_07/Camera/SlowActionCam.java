package chap_07.Camera;

public class SlowActionCam {
    public String name;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo() {
        System.out.println(this.name + " : 자체 개발한 비디오 제작 기능");
    }

}
