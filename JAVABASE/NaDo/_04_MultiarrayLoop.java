package JAVABASE.NaDo;

public class _04_MultiarrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"},
        };

        for (int i = 0; i < 3; i++) { //세로기즌
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();


        String[][] seats2 = new String[][] {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"},
        };
            for (int i = 0; i < seats2.length; i++) {//세로
                for (int j = 0; j < seats2[i].length; j++) {//가로
                    System.out.print(seats2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
