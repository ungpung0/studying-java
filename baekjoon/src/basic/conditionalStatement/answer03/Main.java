package basic.conditionalStatement.answer03;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int year = Integer.parseInt(bufferedReader.readLine());
        if(((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0))
            bufferedWriter.write("1");
        else
            bufferedWriter.write("0");
        bufferedReader.close();
        bufferedWriter.close();
    }

}
