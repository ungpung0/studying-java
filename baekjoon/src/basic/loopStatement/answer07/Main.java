package basic.loopStatement.answer07;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int count = Integer.parseInt(bufferedReader.readLine());
        int numberA, numberB;
        for(int i = 1; i <= count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            numberA = Integer.parseInt(stringTokenizer.nextToken());
            numberB = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(
                    "Case #" + i + ": " + numberA + " + " + numberB + " = " + (numberA + numberB) + "\n"
            );
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
