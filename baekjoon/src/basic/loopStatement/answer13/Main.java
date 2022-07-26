package basic.loopStatement.answer13;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(bufferedReader.readLine()), temp = input;
        int count = 0;

        do {
            int ten = (temp < 10) ? 0 : (temp - (temp % 10)) / 10;
            int one = temp % 10;
            int sum = ten + one;

            if(sum < 10)
                temp = one * 10 + sum;
            else
                temp = one * 10 + sum % 10;
            count++;
        }while(temp != input);

        bufferedWriter.write(String.valueOf(count));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
