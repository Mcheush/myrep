package Alina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число служащих ");
        int n = sc.nextInt();
        System.out.println("-------------------------------------");
        employee[] mas = new employee[n];
        for (int i=0; i<n; i++) {
            System.out.println("Введите информацию о служащем №" + (i+1));
            System.out.print("Имя: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Фамилия: ");
            String surname = sc.nextLine();
            System.out.print("Отчество: ");
            String patronymic = sc.nextLine();
            System.out.print("Должность: ");
            String post = sc.nextLine();
            System.out.print("Возраст ");
            int age = sc.nextInt();
            mas[i] = new employee(name, surname, patronymic, post, age);
            System.out.println("-------------------------------------");
        }
        System.out.println("Число созданных объектов " + employee.getK());
        System.out.println("-------------------------------------");

        System.out.println("Информация о служащих, возраст которых выше среднего: ");

        double avage = 0;
        for (employee x: mas) { // вычисляем средний возраст
            avage += x.getAge();
        }
        avage = avage / n; //средний возраст

        for (employee x: mas) { // вычисляем средний возраст
            if (x.getAge() >= avage) {
                x.show();
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("Информация о служащих, имена которых начинаются с А, М, Н: ");

        int chA;
        int chM;
        int chN;
        boolean ex = false;

        for (employee x: mas) {
            chA = x.getName().indexOf("А");
            chM = x.getName().indexOf("М");
            chN = x.getName().indexOf("Н");
            if (chA == 0 || chM == 0 || chN == 0) {
                x.show();
                ex = true;
            }
        }

        if (!ex) {
            System.out.println("Таких имен нет!");
        }
    }
}
