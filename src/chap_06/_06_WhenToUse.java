package chap_06;

public class _06_WhenToUse {
    public static int getpower(int number) {
        // int result = number * number;
        // return result;
        // return number * number;
        return getPower(number, 2); // 어떤 수의 2승을 구할 때 사용
    } // 생성된 getPower(int number, int exponent) 함수에 현재 메소드의 number를 넣고,
      // exponent 값을 넣어주면 밑에 있는 함수 호출 실행
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4


        // 3의 3승을 구하기
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27


        // 4의 2승을 구하기
        System.out.println(getPower(4, 2)); //  4 * 4 = 16
    }
}
