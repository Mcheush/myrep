package Exersice_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int xLen, lenY; // a - строки, b - столбцы, кол - во эл - тов массива
        int inputNum; // число, которому не должен быть равен эл - т массива
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы ");
        xLen = sc.nextInt();
        System.out.print("Введите количство столбцов матрицы ");
        lenY = sc.nextInt();
        int[][] array = new int[xLen][lenY];

        for (int i = 0; i < xLen; i++) { // заполнение массива рандомными числами
            for (int j = 0; j < lenY; j++) {
                int c = (int) (Math.random() * ((100 + 100) + 1) - 100);
                array[i][j] = c;
            }
        }

        for (int[] i : array) {                 //Вывод матрицы в консоль
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.print("Введите число, которому не будет равен ни один из элеметов матрицы ");
        inputNum = sc.nextInt();
        boolean[] results = new boolean[xLen];
        boolean res = false;

        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < lenY; j++) {
                if (array[i][j] == inputNum) {
                    results[i] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < xLen; i++) {
            if (results[i]) {
                res = true;
                System.out.println("Строка " +(i+1));
            }
        }

        if (!res) {
            System.out.println("Таких строк нет");
        }

    }
}
