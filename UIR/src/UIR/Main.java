package UIR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начальное давление в системе: ");
        int stPres = sc.nextInt();
        System.out.print("Введите вероятное аварийное давление в системе: ");
        int finPres = sc.nextInt();
        System.out.print("Введите уставку ПИД: ");
        int setpoint = sc.nextInt();
        System.out.println("----------------------");
        boolean a = false;

        if (stPres <= 1.5 || finPres >= 8) {
            a = true;
        }

        if (!a) {
            System.out.println("Разрешение на работу насоса");
            System.out.println("Регулирование давления по уставке ПИД");
            System.out.println("----------------------");

            if (setpoint != stPres) {
                if (setpoint > stPres) {
                    System.out.println("Увеличение частоты на выходе ПЧ и приведение давления к уставке согласно ПИД");
                }
                if (setpoint < stPres){
                    System.out.println("Уменьшение частоты на выходе ПЧ и приведение давления к уставке согласно ПИД");
                }
            } else {
                System.out.println("Поддержание текущих оборотов двигателя насоса");
            }

        }
        else {
            System.out.println("Аварийное отключение насосов");
        }
    }
}
