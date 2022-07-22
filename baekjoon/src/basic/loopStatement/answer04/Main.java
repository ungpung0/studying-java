package basic.loopStatement.answer04;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());
        for(int i = 1; i <= number; i++)
            bufferedWriter.write(String.valueOf(i) + "\n");
        bufferedReader.close();
        bufferedWriter.close();
    }

}
