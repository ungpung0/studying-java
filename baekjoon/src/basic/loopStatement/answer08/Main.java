package basic.loopStatement.answer08;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bufferedReader.readLine());
        for(int i = 1; i < count + 1; i++) {
            for(int j = 0; j < i; j++) {
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
