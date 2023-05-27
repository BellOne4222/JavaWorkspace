package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        
        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // and를 ,로 변환 : 문자열.replace(바꾸려는 단어, 바꿀 단어) -> 공백도 포함해야함
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작해서 그 이전 내용은 삭제 : 문자열.substring(index)
        System.out.println(s.substring(s.indexOf("Java"))); // Java의 위치를 찾아서 그 위치 이전의 내용 삭제
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java부터 .직전까지 만 남기고 이전 내용 삭제 : Java ~ .직전 범위
        
        // 공백 제거
        s = "         I love Java.           ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거 : 문자열.trim()

        // 문자열 결합 : 문자열.concat(결합하려는 문자열)
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }
}
