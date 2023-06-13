package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 else if
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1
        boolean hanlabongAde = true;
        boolean mangoJuice = true;

        if (hanlabongAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if(mangoJuice){ // else if는 여러번 사용 가능
            System.out.println("망고 주스 +1");
        }
        else{ // else는 없어도 가능
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 +1");
        
        
    }
}
