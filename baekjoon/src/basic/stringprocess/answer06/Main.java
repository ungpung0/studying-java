package basic.stringProcess.answer06;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf(stringTokenizer.countTokens()));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
