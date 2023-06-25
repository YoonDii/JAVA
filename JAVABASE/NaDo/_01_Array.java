package JAVABASE.NaDo;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공긴
        String coffeeRoss = "아메리카노";
        String coffeeRachal = "카페모카";
        String coffeechandler = "라떼";
        String coffeeMonica = "카푸치노";

        //배열선언 첫번재 방법
        //String[] coffees = new String[4]; //어떤 크기의 배열을 만들껀지 선언해야함

        //두번재 방법
//        String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 세번째 방법
//        String[] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};

        //네번째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        System.out.println(coffees[0] + "하나");
        System.out.println(coffees[1] + "하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + "하나");
        System.out.println(coffees[3] + "하나");
    }
}
