package basic.conditionalStatement.answer05;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int timeHour = Integer.parseInt(stringTokenizer.nextToken());
        int timeMinu = Integer.parseInt(stringTokenizer.nextToken());

        if((timeMinu - 45) < 0) {
            timeMinu += 15;
            timeHour--;
            timeHour = (timeHour < 0) ? 23 : timeHour;
        }else
            timeMinu -= 45;
        bufferedWriter.write(String.valueOf(timeHour + " " + timeMinu));

        bufferedReader.close();
        bufferedWriter.close();
    }

}
