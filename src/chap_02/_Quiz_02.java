package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int tall_1 = 115;
        int tall_2 = 121;


        String first = (tall_1 >= 120) ? "키가" + tall_1 + "이므로 탑승 가능합니다." : "키가 " + tall_1 + "cm 이므로 탑승 불가능합니다.";
        String second = (tall_2 >= 120) ? "키가 " + tall_2 + "cm 이므로 탑승 가능합니다." : "키가 " + tall_2 + "cm 이므로 탑승 불가능합니다.";
        System.out.println(first); // 키가 115cm 이므로 탑승 불가능합니다.
        System.out.println(second); // 키가 121cm 이므로 탑승 가능합니다.

    }
}
