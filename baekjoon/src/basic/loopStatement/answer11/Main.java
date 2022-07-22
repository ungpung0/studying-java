package basic.loopStatement.answer11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int numberA, numberB;

        while(true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            numberA = Integer.parseInt(stringTokenizer.nextToken());
            numberB = Integer.parseInt(stringTokenizer.nextToken());
            if(numberA == 0 && numberB == 0)
                break;
            else
                bufferedWriter.write((numberA + numberB) + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
