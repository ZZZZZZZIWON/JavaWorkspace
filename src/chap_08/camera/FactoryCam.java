package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }
    private Detectable detector;
    private Reportable reporter;
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }
    @Override
    public void report() {
        reporter.report();
    }
}
