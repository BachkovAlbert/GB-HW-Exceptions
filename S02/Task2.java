package S02;

class Task2 {
    public static void Tk2() {
        try {
            int[] arr = {1, 4, 6, 8, 11, 21, 67, 99, 103};
            int d = 0;
            int i = 8;
            double catchedRes1 = arr[i] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("!Ошибка! Деление на ноль!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Введенный индекс выходит за пределы массива");
        }
    }
}
