package chap_04;

public class _09_multipletable {
    public static void main(String[] args) {
        // 구구단
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}
