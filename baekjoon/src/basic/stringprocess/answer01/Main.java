/*
* 문제 번호 : 11654번.
* 문제 설명 : 알파벳 소문자, 대문자, 숫자 중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력.
*/

package basic.stringProcess.answer01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char temp = scanner.nextLine().charAt(0);
        System.out.println((int)temp);
        scanner.close();
    }
}
