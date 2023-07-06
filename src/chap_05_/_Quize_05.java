package chap_05_;

public class _Quize_05 {
    public static void main(String[] args) {
        // 내 답변
        String[] sizes = new String[]{"250","255","260","265","270","275","280","285","290","295"};

        for (int i = 0; i < sizes.length; i++) {
            System.out.println("사이즈 " + sizes[i] + " (재고있음)");

        }

        System.out.println("___________________");

        // 정답
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
            System.out.println("사이즈 " + sizeArray[i] + " (재고있음)");

        }

    }
}
