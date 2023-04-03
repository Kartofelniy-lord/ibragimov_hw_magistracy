package lr2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        Random random = new Random();

        int min_num = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.print(nums[i] + " ");
            if (nums[i] < min_num) min_num = nums[i];
        }

        System.out.println("\nМинимальные значения и их индексы");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min_num) System.out.println("Значение: " + nums[i] + " Индекс: " + i);
        }
    }
}
