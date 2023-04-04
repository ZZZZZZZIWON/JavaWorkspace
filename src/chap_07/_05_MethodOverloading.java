package chap_07;

import java.sql.SQLOutput;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망";

        b1.record(false, false, 10);
        System.out.println("------------------------");
        b1.record(true, false, 3);
        System.out.println("-------------------------");
        b1.record(true, true, 5);
        System.out.println("-------------------------");
        b1.record();

        // String
        String s = "Blackbox";
        System.out.println(s.indexOf("a"));
    }
}
