package basic.operationArithmetic.answer08;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentense = bufferedReader.readLine();
        double answer = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(sentense, " ");
        for(int i = 0; i < stringTokenizer.countTokens(); i++) {
            if(i == 0)
                answer += Double.valueOf(stringTokenizer.nextToken());
            answer /= Double.valueOf(stringTokenizer.nextToken());
        }

        bufferedWriter.write(String.valueOf(answer));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
