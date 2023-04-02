package chap_03;

import org.w3c.dom.ls.LSOutput;

// "901231-1234567" 인 경우 901231-1
// "030708-4567890" 인 경우 030708-4
public class _Quiz_03_T {
    public static void main(String[] args) {
        String id = "901231-1234567"; // 주민등록번호 13자리
        System.out.println(id.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        id = "030708-4567890";
        System.out.println(id.substring(0,id.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지

    }
}
