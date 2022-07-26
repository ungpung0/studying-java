package basic.oneDimensionArray.answer03;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 1;

        for(int i = 0; i < 3; i++) {
            result *= Integer.parseInt(bufferedReader.readLine());
        }
        String[] arrayStr = String.valueOf(result).split("");
        int[] arrayInt = new int[10];

        for(int i = 0; i < arrayStr.length; i++)
            arrayInt[Integer.parseInt(arrayStr[i])]++;

        for(int i : arrayInt)
            bufferedWriter.write(i + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }

}
