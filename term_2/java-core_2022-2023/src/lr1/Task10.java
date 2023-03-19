package lr1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int birth_year =  0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        birth_year = scanner.nextInt();

        System.out.println("Ваш возраст: " + (2023 - birth_year));
    }
}
