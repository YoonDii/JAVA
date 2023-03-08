package JAVABASE.NaDo;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";

        System.out.println(id.substring(0,8)); //0위치부터 8위치 직전까지  901231-1
        System.out.println(id.substring(0,id.indexOf("-")+2)); //901231-1 하이픈 위치 +2직전까지
    }
}
