package chap_06_;

public class _07_VariableScope {
    public static void methodA(){
        //System.out.println(number); // main내에서 선언한 변수는 다른 곳에서 사용 불가
        //System.out.println(result);
    }

    public static void methodB(){
        int result = 1; // 지역 변수 : 선언한 곳에서만 사용가능한 변수, 값 전달을 통해 다른 곳에서 변수 사용 가능
    }
    public static void main(String[] args) {
        int number = 3;
        //System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            
        }
        //System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
        }
        //System.out.println(j); // j 사용 불가(범위 이탈)
    }
}
