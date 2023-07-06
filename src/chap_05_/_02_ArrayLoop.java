package chap_05_;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("_________");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("________________");

        // enhanced for (for-each) 반복문, 배열안에 있는 값을 하나씩 출력, foreach 입력하면 가능
        for (String coffee : coffees){
            System.out.println(coffee + " 하나");
        }


    }
}
