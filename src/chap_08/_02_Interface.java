package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 단일상속 (extends)
        Reportable normalreporter = new NormalReporter();
        normalreporter.report();

        Reportable videoreporter = new VideoReporter();
        videoreporter.report();

        System.out.println("---------------------------");

        Detectable firedetector = new FireDetector();
        firedetector.detect();

        Detectable advancedfiredetector = new AdvancedFireDetector();
        advancedfiredetector.detect();

        System.out.println("---------------------------");

        FactoryCam factorycam = new FactoryCam();
        factorycam.setDetector(advancedfiredetector);
        factorycam.setReporter(videoreporter);

        factorycam.detect();
        factorycam.report();
    }
}
