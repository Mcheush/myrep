package exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        double y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число ");
        x=sc.nextInt();
        y=x/100;
        x=x%2;

        if ((x!=0)&(y>=0.1)&(y<1)) {
            System.out.print("Число является нечетным двузначным ");
        }
        else {
            System.out.print("Число НЕ явялется нечетным двузначным ");
        }

    }
}
