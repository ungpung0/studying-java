package basic.operationArithmetic.answer07;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentense = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(sentense, " ");
        int result = 0;
        for(int i = 0; i < stringTokenizer.countTokens(); i++) {
            if (i == 0)
                result += Integer.parseInt(stringTokenizer.nextToken());
            result *= Integer.parseInt(stringTokenizer.nextToken());
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
