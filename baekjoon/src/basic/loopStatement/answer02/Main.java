package basic.loopStatement.answer02;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int count = Integer.parseInt(bufferedReader.readLine());
        int numberA, numberB;
        for(int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            numberA = Integer.parseInt(stringTokenizer.nextToken());
            numberB = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(String.valueOf((numberA + numberB) + "\n"));
        }
        bufferedWriter.close();
        bufferedReader.close();
    }

}
