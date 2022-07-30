package basic.basicMath1.answer02;

import java.io.*;

public class Main {

    int beeHouse(int n) {
        int result = 0;
        result = 3 * n * (n + 1) + 1;
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Main main = new Main();
        int number = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        while(true) {
            int result = main.beeHouse(count);
            if(number == 1) {
                count = 0;
                break;
            }
            if(number <= result)
                break;
            count++;
        }
        bufferedWriter.write(String.valueOf(count + 1));
        bufferedWriter.close();
        bufferedWriter.close();
    }

}
