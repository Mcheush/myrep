package Exersice_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b; // a - строки, b - столбцы, кол - во эл - тов массива
	    Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы ");
        a = sc.nextInt();
        System.out.print("Введите количство столбцов матрицы ");
        b = sc.nextInt();
        int [][] array = new int[a][b];
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                int c = (int) (Math.random() * ((100 + 100) + 1) - 100);
                array[x][y] = c;
            }
        }
        for (int[] i : array) {
            for (int j: i) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }



    }
}
