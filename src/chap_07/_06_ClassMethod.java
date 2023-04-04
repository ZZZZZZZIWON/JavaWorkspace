package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        Blackbox b1 = new Blackbox();
//        b1.callServiceCenter();
//
//        Blackbox b2 = new Blackbox();
//        b2.callServiceCenter();

        Blackbox.callServiceCenter(); // 객체를 만들지 않고 클래스 메소드에 직접 접근

        String s = String.valueOf(3);
    }
}
