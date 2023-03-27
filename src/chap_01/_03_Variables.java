package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; // 문자열 변수 선언
        name = "김종원"; // 문자열 변수 name 안에 들어가는 변수 선언
        // = String name = "김종원"
        int hour = 15; // 정수형 변수 선언


        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다."); // +를 통해 문자열을 합침
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; // 실수형 변수 선언
        char grade = 'A'; // 여러 글자는 String, 한 글자는 char
        name = "강백호"; // 값을 업데이트 하여 밑에는 강백호로 출력됨
        System.out.println(name + "님의 평균 점수는 " + score + " 점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true; // 참과 거짓을 나타내는 boolean 자료형
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f; // 소수점을 포함하는 숫자는 double로 인식해서 float을 사용하기 위해서는 뒤에 f를 붙여야함,
                                  // 긴 소수점은 double을 사용하고 짧은 소수는 float 사용
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // int의 범위를 넘어서는 수를 사용할 때에는 long 자료형 사용(뒤에 L 붙이기)
        l = 1_000_000_000_000L; // 3자리 구분을 하기 위해 언더바 붙일수 있음
        System.out.println(l);

        //int, long, float, double, char, String, boolean : 자료형
    }
}
