package basic.loopStatement.answer03;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        for(int i = 1; i <= number; i++) {
            result += i;
        }
        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
