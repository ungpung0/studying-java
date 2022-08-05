package basic.functionRecursive.answer01;

import java.io.*;

public class Main {

    static int factorial(int number) {
        if(number == 0 || number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());
        bufferedWriter.write(String.valueOf(factorial(number)));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
