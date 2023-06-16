import java.util.Scanner;

public class work2 {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                float number = Float.parseFloat(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Неверный формат числа. Попробуйте еще раз.");
            }
            finally {
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Вы ввели " + number);
    }
}
 