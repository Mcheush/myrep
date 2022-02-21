package Exersice3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x = 0, N;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.print("Введите число N: ");
        N = sc.nextInt();
        if (N > x) {
            x = N;
        }
    }
    while (N !=0);
    if (x > 0) {
        System.out.print("Максимальное число "+x);
    }
    else {
        System.out.print("Последовательность не содержит чисел!");
    }


    }
}
