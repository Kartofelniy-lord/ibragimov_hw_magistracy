package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int[] arr = IntStream.generate(() -> new Random().nextInt(1000)).limit(in.nextInt()).toArray();
        System.out.println(Arrays.toString(arr));
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processors);
        int chunkSize = arr.length / processors;
        AtomicInteger sum = new AtomicInteger();
        for (int i = 0; i < processors; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            if (i == processors - 1) {
                end = arr.length;
            }
            int[] subArr = Arrays.copyOfRange(arr, start, end);
            executor.execute(() -> {
                int localSum = Arrays.stream(subArr).sum();
                synchronized (Task6.class) {
                    sum.addAndGet(localSum);
                }
            });
        }
        executor.shutdown();
        if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
            executor.shutdownNow();
        }
        System.out.println("Сумма всех элементов в массиве: " + sum);
    }
}
