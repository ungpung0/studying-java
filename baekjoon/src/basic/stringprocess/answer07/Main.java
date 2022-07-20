package basic.stringProcess.answer07;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answerInputed = bufferedReader.readLine();
        StringBuffer stringBuffer = new StringBuffer(answerInputed);
        String answerReversed = stringBuffer.reverse().toString();
        String[] result = answerReversed.split(" ");

        if((Integer.parseInt(result[0])) > (Integer.parseInt(result[1])))
            bufferedWriter.write(result[0]);
        else
            bufferedWriter.write(result[1]);

        bufferedWriter.close();
        bufferedReader.close();
    }
}
