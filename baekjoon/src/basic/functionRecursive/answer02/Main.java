package basic.functionRecursive.answer02;

import java.io.*;

public class Main {

    static int fibonacci(int number) {
        if(number == 0)
            return 0;
        else if(number == 1 || number == 2)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());
        bufferedWriter.write(String.valueOf(fibonacci(number)));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
