package basic.stringprocess.answer03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentense = scanner.next();
        char[] array = sentense.toCharArray();
        int tempNum = 0, tempResult = -1;
        String result = "";
        for(int i = 97; i < 123; i++) {
            for(int j = 0; j < array.length; j++) {
                tempNum = (int)array[j];
                if(i == tempNum) {
                    tempResult = j;
                    break;
                }
            }
            result += (tempResult + " ");
            tempResult = -1;
        }
        System.out.println(result);
        scanner.close();
    }
}
