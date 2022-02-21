package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double x, y, z, f; // Объявляем четыре переменные типа double
        Scanner sc=new Scanner(System.in);
        System.out.print("x= ");
        x=sc.nextDouble(); // Ввод пользователем значения переменной x
        System.out.print("y= ");
        y=sc.nextDouble(); // Ввод пользователем значения переменной y
        System.out.print("z= ");
        z=sc.nextDouble(); // Ввод пользователем значения z
        f=(Math.abs(3*x-y))-((0.15*y)/(13*x*y+7*z-2));
        System.out.print("Значение выражения равно "+f);




    }
}
