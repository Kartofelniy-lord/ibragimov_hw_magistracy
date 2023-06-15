package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Task5 {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int[] arr = IntStream.generate(() -> new Random().nextInt(1000000)).limit(in.nextInt()).toArray();
        System.out.println(Arrays.toString(arr));
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество потоков: " + processors);
        int chunkSize = arr.length / processors;
        System.out.println("Колличество элементов на поток: " + chunkSize);
        AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);
        Thread[] threads = new Thread[processors];
        for (int i = 0; i < processors; i++) {
            final int start = i * chunkSize;
            final int end = (i == processors - 1) ? arr.length : (i + 1) * chunkSize;
            threads[i] = new Thread(() -> {
                int localMax = Arrays.stream(arr, start, end).max().getAsInt();
                synchronized (lock) {
                    if (localMax > max.get()) {
                        max.set(localMax);
                    }
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
    }
}
