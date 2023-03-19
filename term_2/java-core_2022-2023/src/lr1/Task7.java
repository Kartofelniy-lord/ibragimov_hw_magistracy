package lr1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int age = 0;
        String name = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        name = scanner.nextLine();
        System.out.println("Введите Возраст: ");
        age = scanner.nextInt();

        System.out.println("Ваше имя: " + name + "\nВаш возраст: " + age);
    }
}
