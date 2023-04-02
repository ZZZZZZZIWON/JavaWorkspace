package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height;
        height = 115;

        String check = (height >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " + check + "합니다");

        height = 121;
        check = (height >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승 " + check + "합니다");
    }
}
