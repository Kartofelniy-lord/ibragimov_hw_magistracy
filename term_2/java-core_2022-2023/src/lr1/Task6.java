package lr1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        builder.append("Hello ").append(scanner.nextLine()).append(" ");
        System.out.println("Введите имя: ");
        builder.append(scanner.nextLine()).append(" ");
        System.out.println("Введите отчество: ");
        builder.append(scanner.nextLine());

        System.out.println(builder);
    }
}
