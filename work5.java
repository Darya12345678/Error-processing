import java.util.Scanner;
public class work5 {
    

    public class EmptyStringExceptionExample {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Введите строку: ");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Ошибка: пустые строки вводить нельзя.");
                } else {
                    System.out.println("Вы ввели: " + input);
                }
            } finally {
                scanner.close();
            }
        }
    }

}
