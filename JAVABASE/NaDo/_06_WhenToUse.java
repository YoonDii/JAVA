package JAVABASE.NaDo;

public class _06_WhenToUse {
    public static void main(String[] args) {
        //메소드가 필요한 이유
        //2의 2승 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);//4

        //3의 3승 구하기
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);//27
    }
}
