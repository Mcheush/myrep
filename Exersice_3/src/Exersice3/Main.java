package Exersice3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = 0, N;
        Scanner sc = new Scanner(System.in);
        ArrayList Array = new ArrayList();
        do {
            System.out.print("Введите N ");
            N = sc.nextInt();
            Array.add(x, N);
            x++;
        }
        while (N != 0);
        System.out.print("Максимальное из введенных чисел: "+ Collections.max(Array));


    }
}
