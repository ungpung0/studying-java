package basic.conditionalStatement.answer01;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentense = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(sentense, " ");
        int numberA = Integer.parseInt(stringTokenizer.nextToken());
        int numberB = Integer.parseInt(stringTokenizer.nextToken());

        if(numberA < numberB)
            bufferedWriter.write("<");
        else if(numberA > numberB)
            bufferedWriter.write(">");
        else
            bufferedWriter.write("==");

        bufferedReader.close();
        bufferedWriter.close();
    }

}
