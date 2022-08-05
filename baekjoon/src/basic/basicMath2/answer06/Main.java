package basic.basicMath2.answer06;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static boolean isPrime(int number) {
        boolean result = false;
        if(number == 1) {
            result = false;
        }else if(number <= 3) {
            result = true;
        }else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    result = false;
                    break;
                }
                else
                    result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받기.
        int count = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            numberList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        // 소수판별.
        for(int i = 0; i < numberList.size(); i++) {
            int number = 0;
            for(int j = 2; j <= numberList.get(i) / 2; j++) {
                if(isPrime(j) == true && isPrime(numberList.get(i) - j) == true) {
                    number = numberList.get(i) - j;
                }
            }
            bufferedWriter.write((numberList.get(i) - number) + " " + number + "\n");
        }

        // 출력하기.
        bufferedReader.close();
        bufferedWriter.close();
    }

}
