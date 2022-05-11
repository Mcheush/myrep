package Alina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Len; // число строк и стобцов
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Введите число строк и столбцов матрицы ");
        Len = sc.nextInt();

        int[][] array = new int[Len][Len];

        for (int i = 0; i < Len; i++) { // заполнение массива рандомными числами
            for (int j = 0; j < Len; j++) {
                int c = (int) (Math.random() * ((100 + 100) + 1) - 100);
                array[i][j] = c;
                System.out.print(c + " "); //Вывод матрицы в консоль
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < Len; i++) {
            for (int j = i + 1; j < Len; j++) {
                System.out.println(array[i][j]);
            }
        }



    }
}
