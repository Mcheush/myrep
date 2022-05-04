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
                System.out.print(c + " "); //Вывод матрицы в консоль
            }
            System.out.println();
        }

        System.out.print("Введите число, которому не будет равен ни один из элеметов матрицы ");
        inputNum = sc.nextInt();
        boolean[] results = new boolean[xLen]; //Создаю массив для поиска числа в массиве
        int stat = 0;

        for (int i = 0; i < xLen; i++) { // Если в массиве array есть введенное число, то эл-т results = true
            for (int j = 0; j < lenY; j++) {
                if (array[i][j] == inputNum) {
                    results[i] = true;
                    break;
                }
            }
        }

        int temp; //Счетчик для проверки на то, все ли эл-ты results[] == true

        for (temp = 0; temp < xLen; temp++) { //Цикл для счетсика, каждый раз когда InputNum==true, то stat++
            if (results[temp]) {
                stat++;
            }
        }

        if (stat != temp) { //Здесь проверка на то, все ли эл-ты results[] == true
            for (int i = 0; i < xLen; i++) {
                if (!results[i]) {
                    System.out.println("Строка " +(i+1));
                }
            }
        }
        else {
            System.out.println("Таких строк нет");
        }
    }
}
