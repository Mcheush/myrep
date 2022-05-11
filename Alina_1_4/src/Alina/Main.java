package Alina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double S = 1, n, y = 3, a = 2;
        Scanner sc;
        sc = new Scanner (System.in);
        System.out.print("Введите число N: ");
        n = sc.nextInt();
        if (n > 0) {
            for (int i = 3; i <= n * 2 + 1; i += 2) {
                S *= a / y;
                y+=2;
                a+=2;
            }
            System.out.print("Значение выражения равно: " + S);
        }
        else {
            System.out.print("Исходные данные не верны!");
        }
    }
}
