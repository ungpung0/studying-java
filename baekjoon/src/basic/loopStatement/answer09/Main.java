package basic.loopStatement.answer09;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());
        for(int i = count; i > 0; i--) {
            for(int j = 1; j <= count; j++) {
                if(i <= j)
                    bufferedWriter.write("*");
                else
                    bufferedWriter.write(" ");
            }
            bufferedWriter.write("\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
