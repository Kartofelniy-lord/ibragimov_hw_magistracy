package lr1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        age = scanner.nextInt();

        System.out.println("Ваш год рождения: " + (2023 - age));

    }
}
