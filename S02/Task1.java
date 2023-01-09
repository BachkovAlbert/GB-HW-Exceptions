package S02;

import java.util.Scanner;

class Task1{
    public static void Tk1(){
        System.out.print("Введите дробное число(с запятой): ");
        Scanner sc = new Scanner(System.in);
        try{
            float num = sc.nextFloat();
            System.out.println("Введенное число: " + num);
        } catch (Exception e){
            System.out.println("Неправильный ввод числа. Повторите попытку.");
            Tk1();
        }
        sc.close();
    }
}
