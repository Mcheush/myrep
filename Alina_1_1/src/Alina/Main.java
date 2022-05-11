package Alina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        x = sc.nextInt();
        System.out.print("Введите значение y: ");
        y = sc.nextInt();
        System.out.print("Введите значение z: ");
        z = sc.nextInt();

        double res = ((y - x)/(z + 3 * x)) * ((0.25 * x + y)/(Math.log(x) - z));

        System.out.println("Значение выражения равно " + res);
    }
}
