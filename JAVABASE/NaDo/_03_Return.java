package JAVABASE.NaDo;

public class _03_Return {
    //전달값이 있는 메서드
    // 호텔 전화번호, 호텔 주소, 액티비티
    public static String getPhonenumber() {
        String phoneNumber = "02-123-5678";
        return phoneNumber;
    }
    public static String getAddtress() {
        return "서울시 어딘가";
    }
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        //반환값
        String contactNumber =  getPhonenumber();
        System.out.println("호텔전화번호 : "+contactNumber);

        String adress = getAddtress();
        System.out.println("호텔주소 : " +adress);

        System.out.println("호텔 액티비티 : " +getActivities());
    }
}
