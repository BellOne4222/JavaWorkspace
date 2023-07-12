package chap_06_;

public class _Quiz_06 {
    public static String getHiddenData(String str, int Idx){
        String hidden = str.substring(0,Idx); // 나코딩 -> 나
        for (int i = Idx; i < str.length(); i++) {
            hidden += "*";
        }
        return hidden;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 1));
        //이름 : 나**
        //주민등록번호 : 990130-1******
        //전화번호 : 0************

    }
}
