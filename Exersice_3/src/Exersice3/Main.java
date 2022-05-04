package Exersice3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = 0, N;
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> Array = new ArrayList(); //Создаю динамический массив
        do {
            System.out.print("Введите N ");
            N = sc.nextInt();
            if (N != 0)  //Проверяю перв. введен. число, если 0 то он будет max если все числа отрицательные
                Array.add(x, N); // Заполняю динамический массив
                x++;

        }
        while (N != 0); //Цикл выполняется пока не будет введен ноль

        int y = Array.size(); // Кладу в переменную значение величины получившегося массива

        if (y == 0) { // Если в массиве нет чисел, то ничего не введено
            System.out.print("Чисел нет");
        }
        else {
            System.out.print("Наибольшее число " + Collections.max(Array)); // Вывожу max число
        }
    }
}
