package chap_06_;

public class _04_ParameterAndReturn {

    public static int getPower(int number){
        int result = number * number;
        return result; // = return number * number
    }

    public static int getPowerByExp(int number, int exponent){ // 전달값
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result; // 반환값
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 함께 사용
        int returnValue = getPower(2);
        System.out.println(returnValue); // 4

        returnValue = getPower(3);
        System.out.println(returnValue);

        returnValue = getPowerByExp(3, 3);
        System.out.println(returnValue); // 27

        System.out.println(getPowerByExp(2,4));
    }
}
