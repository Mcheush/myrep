package exersice2;
import java.util.Scanner;
public class Exersice2 {

    public static void main(String[] args) {
        double x;
        double y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число ");
        x=sc.nextInt();
        y=x/100;
        x=x%2;
        if ((x!=0)&(y>=0.1)&(y<1)) {
            System.out.print("Число является нечетным двузначным "+y);
        }
        else {
            System.out.print("Число НЕ явялется нечетным двузначным " +y);
        }
    }
    
}





   
       
        
        
  