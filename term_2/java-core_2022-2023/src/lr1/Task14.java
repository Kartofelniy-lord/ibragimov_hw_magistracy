package lr1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        num = scanner.nextInt();

        System.out.println((num - 1) + " " + num + " " + (num + 1) + " " + (int) Math.pow(num * 3, 2));
    }
}