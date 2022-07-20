package basic.operationArithmetic.answer12;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentense = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(sentense, " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(String.valueOf(
                ((a + b) % c)
                        + "\n" + (((a % c) + (b % c)) % c) + "\n" + ((a * b) % c) + "\n" + (((a % c) * (b % c)) % c)
        ));
        bufferedReader.close();
        bufferedWriter.close();
    }

}