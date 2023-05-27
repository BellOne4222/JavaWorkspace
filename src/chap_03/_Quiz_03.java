package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String my_number = "980729-1212519";

        System.out.println(my_number.substring(0, 8)); // 980729-1
        System.out.println(my_number.substring(0, my_number.indexOf("-")+2)); // 0~ 하이픈 위치 +2 직전 까지
    }

}
