package chap_06_;

public class _02_Parameter {
    public static void power(int number){ // number -> 매개변수, 파라미터
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number+"의 "+exponent+"승은 "+result);
    }
    public static void main(String[] args) {
        // 전달값, 파라미터
        // 입력받은 수 거듭제곱
        
        // 메소드 소괄호 안에 인수 작성
        power(2); // 2의 2승은 4
        powerByExp(2,2); // 2의 2승은 4
    }


}
