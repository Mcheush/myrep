package CP_3;

import java.util.Scanner;

public class animal_work {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите число животных ");
        int n = sc1.nextInt();
        System.out.println("-------------------------------------");
        animal[] mas = new animal[n];
        for (int i=0; i<n; i++) {
            System.out.println("Введите информацию о животном №" + (i+1));
            System.out.print("Название животного: ");
            sc1.nextLine();
            String name = sc1.nextLine();
            System.out.print("Класс животного: ");
            String klass = sc1.nextLine();
            System.out.print("Средняя масса животного: ");
            int avmass = sc1.nextInt();
            mas[i] = new animal(name, klass, avmass);
            System.out.println("-------------------------------------");
        }
        System.out.println("Число созданных объектов " + animal.getK());
        System.out.println("-------------------------------------");

        System.out.println("Список всех животных: ");
        for (animal x: mas)
            x.show();
        System.out.println("-------------------------------------");

        System.out.println("Список животных, средний вес которых не минимальный: ");

        boolean b = false; // для определения верности условия
        int[] arr = new int[n];
        int cnt1 = 0;
        for (animal x: mas) { // перекладываем данные о массе в интовый массив
            arr[cnt1] = x.getAvmass();
            cnt1++;
        }

        int min = arr[0]; // вычисляем минимальное значение массива
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (animal x: mas) { // Печатаем в консоль животных
            if (min != x.getAvmass()) {
                b = true;
                x.show();
            }
        }

        if (!b) {
            System.out.println("Животных, удовлетворяющих условию нет!");
        }
        System.out.println("-------------------------------------");

        b = false;
        System.out.println("Названия животных, в именах которых нет букв н и Н ");

        for (animal x: mas) {
            boolean c = x.getName().contains("Н");
            boolean d = x.getName().contains("н");
            if (!c & !d) {
                b = true;
                x.show();
            }
        }

        if (!b) {
            System.out.println("Животных, удовлетворяющих условию нет!");
        }
    }
}
