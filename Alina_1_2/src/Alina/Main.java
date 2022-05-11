package Alina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double al, bet;

        System.out.print("Введите угол Alpha: ");
        al = sc.nextDouble();
        System.out.print("Введите угол Beta: ");
        bet = sc.nextDouble();
        if (al > 0 && bet >0) {
            if (al + bet == 180) {
                System.out.println("Треугольник существует и является прямоугольным");
            } else {
                System.out.println("Треугольник существует и НЕ является прямоугольным");
            }
        } else {
            System.out.println("Треугольник не существует");
        }

    }
}
