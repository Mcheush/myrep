package Alina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Len; // число строк и стоблцов
        int cnt = 0; // счетчик для количества чисел
        int res = 0; // переменная для суммы чисел

        System.out.print("Введите число строк и столбцов матрицы ");
        Len = sc.nextInt();

        int[][] array = new int[Len][Len];

        for (int i = 0; i < Len; i++) { // заполнение массива рандомными числами
            for (int j = 0; j < Len; j++) {
                int c = (int) (Math.random() * ((100 + 100) + 1) - 100); // рандомайзер
                array[i][j] = c;
                System.out.print(c + " "); //Вывод матрицы в консоль
            }
            System.out.println();
        }

        System.out.println("---------------------");

        for (int i = 0; i < Len; i++) { // перебор массива и выборка чисел над главной диагональю
            for (int j = i + 1; j < Len; j++) {
                cnt++;
                res += array[i][j]; //сложение чисел над главной диагональю
            }
        }
        System.out.println("Количество всех элементов над главной диагональю матрицы:" +cnt);

        System.out.println("---------------------");
        System.out.println("сумма всех элементов над главной диагональю матрицы:" +res);
    }
}
