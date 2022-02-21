package TEST;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double N;
        double S = 1;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Введите число N ");
        N = sc.nextInt();
        if (N >= 0) {
            for (double i = 2; i <= 2 * N; i += 2) {
                S *= (i / (i + 1));
                System.out.println("Трасса " + S);
            }
            System.out.print("S = " + S);
        }
        else {
            System.out.print("Кал");
        }
    }
}
