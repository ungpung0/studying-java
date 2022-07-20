package basic.operationArithmetic.answer11;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String yearInput = bufferedReader.readLine();
        int yearResult = Integer.parseInt(yearInput) - 543;

        bufferedWriter.write(String.valueOf(yearResult));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
