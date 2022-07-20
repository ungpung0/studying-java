package basic.stringProcess.answer06;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentense = bufferedReader.readLine();
        int result = 0, length = sentense.length();



        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.close();
        bufferedReader.close();
    }
}
