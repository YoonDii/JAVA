package JAVABASE.NaDo;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        //기본 자료형 : int , float, double, long, boolean,...
        //기본 자료형은 메서드를 가지지 않는다.
        //기본 자료형은 소문자로 시작한다.
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        //참조 자료형 : String,...
        //참조 자료형은 메서드를 가질 수 도 있다.
        //참조 자료형은 대문자로 시작한다.
        String[] s = new String[3];
        System.out.println(s[0]); //null


    }
}
