package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) : int, float, double, long, boolean, ...

        int[] i = new int[3];
        System.out.println(i[0]); // 0 (기본값)

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam
        String[] s = new String[3];
        System.out.println(s[0]); // null ( 값을 지정하지 않으면 null값)

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        ///////////////////////////////////////////
        System.out.println("------------------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1; // c1이 참조하는 곳을 함께 참조하게 됨
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라"; // new Camera();의 name을 바꾼 것
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeNAme(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null;
        //System.out.println(c2.name);
    }

    public static void changeNAme (Camera camera){
        camera.name = "잘못된 카메라";
    }
}
