package chapter03;

import java.util.Scanner;

public class Question02 {

    static boolean isOdd(int number) {
        if(number % 2 == 0) {
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(isOdd(number) == true) {
            System.out.println("홀수");
        }else {
            System.out.println("짝수");
        }
    }

}
