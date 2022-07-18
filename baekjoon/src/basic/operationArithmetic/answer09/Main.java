package basic.operationArithmetic.answer09;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentense = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(sentense, " ");
        int number1 = Integer.parseInt(stringTokenizer.nextToken());
        int number2 = Integer.parseInt(stringTokenizer.nextToken());
        bufferedWriter.write(String.valueOf((number1 + number2) + "\n" + (number1 - number2) + "\n"
                + (number1 * number2) + "\n" + (number1 / number2) + "\n" + (number1 % number2)));
        bufferedReader.close();
        bufferedWriter.close();
    }
    
}
