package basic.loopStatement.answer01;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());
        for(int i = 1; i < 10; i++) {
            bufferedWriter.write(String.valueOf(number + " * " + i + " = " + (number * i) + "\n"));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}
