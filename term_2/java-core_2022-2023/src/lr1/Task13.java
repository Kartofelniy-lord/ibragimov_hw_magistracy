package lr1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int num_1 = 0;
        int num_2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        num_1 = scanner.nextInt();
        num_2 = scanner.nextInt();

        System.out.println("Сумма: " + (num_1 + num_2));
    }
}
