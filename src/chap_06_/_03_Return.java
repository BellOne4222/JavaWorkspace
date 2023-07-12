package chap_06_;

public class _03_Return {
    // 호텔 전화번호

    // void는 반환값이 없을때 사용, 반환값이 있을때는 반환값의 자료형을 void 대신 적는다.
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber; // return으로 반환
    }
    // 호텔 주소
    public static String getAddressNumber(){
        return "서울시 어딘가"; // 이런식으로 바로 값 반환도 가능
    }
    // 호텔 액티비티
    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        // 반환값
        String contactNumber = getPhoneNumber(); // return을 통해서 반환되는 값이 contactNumber에 저장
        System.out.println("호텔 전화번호: "+contactNumber);

        String address = getAddressNumber();
        System.out.println("호텔 주소: " + address);

        System.out.println("호텔 액티비티: "+getActivities()); // 이런식으로 값을 변수에 저장안하고 받아서 메소드 그대로 사용 가능
    }
}
