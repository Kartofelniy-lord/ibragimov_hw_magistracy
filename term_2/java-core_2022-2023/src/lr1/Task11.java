package lr1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int birth_year = 0;
        String name = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя и год рождения: ");
        name = scanner.next();
        birth_year = scanner.nextInt();

        System.out.println("Ваше имя: " + name + "\nВаш возраст: " + (2023 - birth_year));
    }
}
