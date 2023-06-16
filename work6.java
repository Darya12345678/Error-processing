import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class work6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите данные в произвольном порядке (Фамилия Имя Отчество датарождения номертелефона пол): ");
            String input = scanner.nextLine().trim();
            String[] data = input.split("\\s+");
            if (data.length != 6) {
                System.out.println("Ошибка: введено неверное количество данных.");
                return;
            }

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDateString = data[3];
            String phoneString = data[4];
            String genderString = data[5];
            LocalDate birthDate;
            try {
                birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            } catch (Exception e) {
                System.out.println("Ошибка: неверный формат даты рождения.");
                return;
            }
            long phone;
            try {
                phone = Long.parseLong(phoneString);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат номера телефона.");
                return;
            }
            if (genderString.length() != 1 || (!genderString.equals("f") && !genderString.equals("m"))) {
                System.out.println("Ошибка: неверный формат пола.");
                return;
            }
            String gender = genderString.equals("f") ? "Ж" : "М";
            String fileName = lastName + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " " + phone + " " + gender);
                writer.newLine();
                System.out.println("Данные успешно записаны в файл " + fileName);
            } catch (IOException e) {
                System.err.println("Ошибка: " + e.getMessage());
                e.printStackTrace();
            }
        } finally {
            scanner.close();
        }
    }
}