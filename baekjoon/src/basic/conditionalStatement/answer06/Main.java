package basic.conditionalStatement.answer06;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int timeCook = Integer.parseInt(bufferedReader.readLine());
        int timeHour = Integer.parseInt(stringTokenizer.nextToken());
        int timeMinu = Integer.parseInt(stringTokenizer.nextToken()) + timeCook;

        if((timeMinu / 60) >= 1) {
            timeHour += (timeMinu / 60);
            timeMinu %= 60;
            if(timeHour > 23)
                timeHour -= 24;
        }

        bufferedWriter.write(timeHour + " " + timeMinu);
        bufferedReader.close();
        bufferedWriter.close();
    }

}
