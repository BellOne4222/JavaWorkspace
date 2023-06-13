package chap_04;

public class _11_continue {
    public static void main(String[] args) {
        // continue

        // for
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            // 손님이 noshow한 경우
            if (i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 즉시 동작을 멈추고 다음 회차 반복 진행 : sold++ 실행 x, sold 카운트수 안올라감
            }
            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다");

        System.out.println("___________________");

        // while 문
        sold = 0;
        int index = 0;
        while (index < 50){
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // noshow
            if (index == noShow){
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // while문에서는 바로 다음 단계로 넘어간다.
            }
            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}