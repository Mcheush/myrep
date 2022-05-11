package Alina;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, a;
        boolean res = false;

        System.out.print("Введите число: ");
        a = sc.nextInt();

        while (a != 0) {
            i = a % 10;
            a = a / 10;
            if (i % 2 != 0) {
                res = true;
            }
        }
        if (res) {
            System.out.println("Цифра входит в запись числа");
        }
        else {
            System.out.println("Цифра не входит в запись числа");
        }
    }
}
