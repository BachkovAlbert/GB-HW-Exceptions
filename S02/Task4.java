package S02;

import java.util.Scanner;

class Task4 {
    public static void Tk4() throws RuntimeException {
        System.out.print("Введите непустую строку: ");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        sc.close();
        if (inputText.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        System.out.println("Вы ввели: " + inputText);
    }
}