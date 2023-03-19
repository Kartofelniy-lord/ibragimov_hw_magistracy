package lr1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String week_day = "";
        String month = "";
        int month_day = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите последовательно название текущего дня недели, название месяца и дату");
        week_day = scanner.next();
        month = scanner.next();
        month_day = scanner.nextInt();

        System.out.println("День недели: " + week_day + "\nДень в месяце: " + month_day + "\nМесяц: " + month);
    }
}
