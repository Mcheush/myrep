package testloop;

public class Main {

    public static void main(String[] args) {
        int [][] a = new int [5][4];
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (i+1) * (j+1);
            }
        }
        for (int x[]:a) {
            for (int y:x) System.out.print(y + "");
        }
        System.out.println();
    }
}
