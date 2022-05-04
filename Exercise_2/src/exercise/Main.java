package exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x;
        double y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число ");
        x=sc.nextInt();
        y=x/100; /*Делю число на 100 и присваиваю y, собственно, здесь и проверяю его на двузначность.
                 Если до запятой два регистра, то число двузначное*/
        x=x%2;   // Здесь делаю проверку на четность

        if ((x!=0)&(y>=0.1)&(y<1)) { /*x!0 - здесь проверяю остаток от деления. Если он = 0, то число четное, что
                                     противоречит условию. y должен лежать от -1 до 1 из - за того, что double x, y,
                                     если int x, y, то почему то java всегда исполняет то, что после else,а
                                     y всегда равен 0.0, не происходит преобразования int в double судя по всему*/

            System.out.print("Число является нечетным двузначным " +y);
        }
        else {
            System.out.print("Число НЕ является нечетным двузначным " +y);
        }

    }
}
