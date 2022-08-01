package basic.basicMath1.answer06;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    protected static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String[] arrayAll = new String[stringTokenizer.countTokens()];
        for(int i = 0; i < arrayAll.length; i++) {
            if(stringTokenizer.hasMoreTokens())
                arrayAll[i] = stringTokenizer.nextToken();
        }

        String[] number1 = arrayAll[0].split("");
        String[] number2 = arrayAll[1].split("");
        int number1Count = number1.length - 1, number2Count = number2.length - 1;
        int[] result; int temp = 0;

        if(number1.length >= number2.length) {
            result = new int[number1.length];
            for(int i = 0; i < result.length; i++) {
                if(number2Count <= -1) {
                    temp = Integer.parseInt(number1[number1Count]);
                }else {
                    temp = Integer.parseInt(number1[number1Count]) + Integer.parseInt(number2[number2Count]);
                }
                result[i] += temp;
                if(result[i] > 9 && i != result.length - 1) {
                    result[i] -= 10;
                    result[i + 1] += 1;
                }
                number1Count--;
                number2Count--;
            }
        }else {
            result = new int[number2.length];
            for(int i = 0; i < result.length; i++) {
                if(number1Count <= -1) {
                    temp = Integer.parseInt(number2[number2Count]);
                }else {
                    temp = Integer.parseInt(number1[number1Count]) + Integer.parseInt(number2[number2Count]);
                }
                result[i] += temp;
                if(result[i] > 9 && i != result.length - 1) {
                    result[i] -= 10;
                    result[i + 1] += 1;
                }
                number1Count--;
                number2Count--;
            }
        }

        for(int i = result.length - 1; i >= 0; i--)
            bufferedWriter.write(String.valueOf(result[i]));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
