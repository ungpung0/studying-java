package basic.stringprocess.answer04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        int countAll = scanner.nextInt();

        for(int i = 0; i < countAll; i++) {
            int count = scanner.nextInt();
            String text = scanner.next();
            char[] array = text.toCharArray();

            for(int j = 0; j < array.length; j++) {
                for(int h = 0; h < count; h++) {
                    result += array[j] + "";
                }
            }
            result += "\n";
        }

        System.out.print(result);
        scanner.close();
    }
}
