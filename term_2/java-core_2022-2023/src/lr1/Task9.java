package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String month = "";
        int days_in_month = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца и количество дней в этом месяце");
        month = scanner.next();
        days_in_month = scanner.nextInt();

        System.out.println(month + " содержит " + days_in_month + " дней");
    }
}
