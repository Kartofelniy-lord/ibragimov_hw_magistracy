package lr4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            process();
        } catch (NullPointerException e) {
            System.out.println("Отсутствуют положительные элементы");
        } catch (NumberFormatException e) {
            System.out.println("Несоответствие числового типа данных");
        }
    }

    private static final int[] arr = new int[10];

    private static void process() throws NullPointerException, NumberFormatException {
        int a = 0;
        int count = 0;
        int z;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 10 чисел для вычисления:");
        for (int i = 0; i < arr.length; i++) {
            z = Integer.parseInt(in.next());
            arr[i] = z;
        }
        for (int anInt : arr) {
            if (anInt >= 0) {
                a += anInt;
                count++;
            }
        }
        if (count == 0) {
            throw new NullPointerException();
        }
        System.out.print("Среднее значение положительных элементов: " + a / count);
    }
}
