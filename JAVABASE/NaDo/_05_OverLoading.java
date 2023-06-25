package JAVABASE.NaDo;

public class _05_OverLoading {
    //똑같은 이름의 메소드를 여러번 중복해서 사용가능하지만, 전달값의 타입이 다르거나, 전달값의 갯수가 달라야 사용가능하다.
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    public static int getPowerStr(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return  result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        System.out.println(getPower(3));//9
        System.out.println(getPowerStr("4"));//16
    }
}
