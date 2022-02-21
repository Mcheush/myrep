package Exercise;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double S = 1, n, y = 2;
        Scanner sc;
        sc = new Scanner (System.in);
        System.out.print("Введите число n ");
        n = sc.nextInt();
        if (n > 0) {
            for (int x = 2; x <= n * 2; x+=2) {
                S *= 1 - (1 / y);
                y+=2;
            }
            System.out.print("Значение выражения равно: " + S);
        }
        else {
            System.out.print("Исходные данные не верны!");
        }

    }
}
