package chap_04;

public class _07_dowhile {
    public static void main(String[] args) {
        // 반복문 dowhile
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("#1");

        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        // do {} while(조건); : 조건 상관없이 do문을 최소 한번을 무조건 실행하고 while문 실행
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
        } while(move + height < distance);
        System.out.println("도착했습니다.");
    }
}
