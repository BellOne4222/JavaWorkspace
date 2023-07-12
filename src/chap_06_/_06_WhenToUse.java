package chap_06_;

public class _06_WhenToUse {

    public static int getPower(int number) { // "4"
        return getPower(number, 2);
    } // 메소드 안에서 또다른 메소드 호출 가능

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;

    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승 구하기
        System.out.println(getPower(2,2));

        System.out.println(getPower(3,3));

        System.out.println(getPower(4,2));
    }
}
