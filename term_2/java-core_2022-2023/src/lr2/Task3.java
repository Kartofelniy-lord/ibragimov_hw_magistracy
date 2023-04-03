package lr2;

import java.util.Scanner;

public class Task3 {
    public static String getEncryptString(String encryptString, int shift, boolean is_encrypting) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        if (!is_encrypting) shift *= -1;

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String message = scanner.nextLine();
        System.out.println("Введите ключ");
        int shift = scanner.nextInt();

        String encryptMessage = getEncryptString(message, shift, true);
        System.out.println("Текст после преобразования: " + encryptMessage);

        System.out.println("Выполнить обратное преобразование? (y/n)");

        while (true) {
            String answer = scanner.next();
            if (answer.equals("y")) {
                String decodedMessage = getEncryptString(encryptMessage, shift, false);
                System.out.println(decodedMessage);
                return;
            } else if (answer.equals("n")){
                System.out.println("До свидания!");
                return;
            }

            System.out.println("Введите корректный ответ");
        }

    }
}
