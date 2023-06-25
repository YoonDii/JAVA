package JAVABASE.NaDo;

public class _01_Method {
    public static void sayhello() {//메소드는 주로 동사를 사용해서 한다.메소드는 어떤 기능들을 하는 코드들의 묶음이라고 생각하면 된다.
        System.out.println("안녕하세요, 메소드입니다.");
    }
    public static void main(String[] args) {
        //메소드 호출
        System.out.println("메소드 호출 전");
        sayhello();
        System.out.println("메소드 호출 후");
    }
}
