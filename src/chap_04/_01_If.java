package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if (조건)
                    //조건 만족시 명령문
        int hour = 10;
        if (hour < 14) { // 조건 명령문이 2개 이상일 경우 중괄호로 감싸주기
            System.out.println("아이스 아메리카노+1");
            System.out.println("샷추가");
        }    
        System.out.println("커피주문완료");

        // 오후 2시 이전 모닝 커피를 마시지 않은 경우
        hour = 15;
        boolean morningCoffee = false; // 모닝 커피
        if (hour < 14 && morningCoffee == false){ // 조건 둘다 만족 해야할때는 && 사용
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        if (hour < 14 && !morningCoffee == false){ // morningCoffee의 반대값(true)을 사용하고 싶으면 !를 앞에다가 붙임
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true){ // 두 조건식 중 하나만 만족시키면 될 때에는 || 사용 (or)
            System.out.println("아이스 아메리카노(디카페인)+1");
        }
        System.out.println("커피 주문 완료 #3");

    }
}
