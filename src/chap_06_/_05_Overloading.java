package chap_06_;

public class _05_Overloading {
    public static int getPower(int number){ // "4"
        int result = number * number;
        return result; // = return number * number
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber); // 받은 문자열을 정수로 변환
        return number * number;
    }

    public static int getPower(int number, int exponent){ // 전달값
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result; // 반환값
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 : 메소드 이름은 똑같지만 전달값이 달라서 중복해서 사용가능
        // 같은 이름의 메소드를 여러 번 선언
        // 전달값의 타입이 다르거나 전달값의 개수가 다를때 사용 가능
        // 반환형(void, int...)는 다르면 안된다.

        System.out.println(getPower(3)); // 9
        System.out.println(getPower("4")); // 문자열을 숫자로 바꿔서 number 출력 16
        System.out.println(getPower(3,3));
    }
}
