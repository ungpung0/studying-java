package basic.operationArithmetic.answer05;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
        int result = 0;

        while(stringTokenizer.hasMoreTokens()) {
            result += Integer.parseInt(stringTokenizer.nextToken());
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
