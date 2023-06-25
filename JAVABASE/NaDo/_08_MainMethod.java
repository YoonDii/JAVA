package JAVABASE.NaDo;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s:args) {
            System.out.println(s);
            //텍스트
            //전달값
            //입니다
        if (args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println("도서조회 메뉴입니다.");
                    break;
                case"2":
                    System.out.println("도서대출메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }else{
            System.out.println("사용) 1~3 메뉴 중 하나를 입력해 주세요.");
        }
        }
    }
}
