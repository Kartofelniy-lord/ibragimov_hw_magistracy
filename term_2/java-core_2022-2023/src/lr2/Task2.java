package lr2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int[][] nums = new int[rows][columns];

        int counter = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    nums[i][j] = counter++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    nums[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
