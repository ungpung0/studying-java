package basic.operationArithmetic.answer10;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentense = bufferedReader.readLine();
        bufferedWriter.write(sentense + "??!");

        bufferedReader.close();
        bufferedWriter.close();
    }

}
