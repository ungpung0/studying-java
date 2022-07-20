/*
 * 문제 번호 : 11720 번.
 * 문제 설명 : N개의 숫자가 공백없이 쓰일 때, 숫자들을 합친 결과를 출력.
 */

package basic.stringProcess.answer02;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 0;
        String[] array = scanner.next().split("");

        for(int i = 0; i < count; i++) {
            result += Integer.parseInt(array[i]);
        }
        System.out.println(result);
        scanner.close();
    }
}
