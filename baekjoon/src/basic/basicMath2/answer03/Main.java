package basic.basicMath2.answer03;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(bufferedReader.readLine());

        for(int i = 2; i <= number; i++) {
            while(number % i == 0) {
                number /= i;
                bufferedWriter.write(i + "\n");
            }
            if(number <= i) {
                if (number == 1)
                    break;
                else {
                    bufferedWriter.write(number + "\n");
                    break;
                }
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
