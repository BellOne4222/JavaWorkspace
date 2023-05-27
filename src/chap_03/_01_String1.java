package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C";
        System.out.println(s);

        // 문자열의 길이 : 문자열.length()
        System.out.println(s.length()); // 28

        // 대소문자 변환 : 대문자로 -> 문자열.toUpperCase(), 소문자로 -> 문자열.toLowerCase()
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계 : 문자열.contains("찾는단어")
        System.out.println(s.contains("Java")); // 포함된다면 true/ 없으면 false
        System.out.println(s.indexOf("Java")); // 인덱스 위치정보 : 문자열.indexOf("단어"), 없으면 -1 반환
        System.out.println(s.indexOf("and")); // 처음 만나는 and
        System.out.println(s.lastIndexOf("and")); // 마지막 and 위치, 마지막 해당 단어 위치 반환 : 문자열.lastIndexOf
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하는지 확인 : 문자열.startsWith(단어)
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나는지 확인 : 문자열.endsWith("단어")

    }
}
