package JAVABASE.NaDo;

public class _07_VariableScope {
    public static void methodA(){
        System.out.println();
    }
    public static void methodB() {
        int result = 1; //지역변수는 변수가 선언된 영역에서만 사용가능
    }
    public static void main(String[] args) {
        int number = 3;

    }
}
