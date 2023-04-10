package chap_07;
import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ...
        // public (final) void ...
        // public > abstract > static > final > ...
        ActionCam actioncam = new ActionCam();
        // actioncam.lens = "표준렌즈";
        actioncam.recordVideo();
        actioncam.makeVideo();

        SlowActionCam slowactioncam = new SlowActionCam();
        slowactioncam.makeVideo();

    }
}
