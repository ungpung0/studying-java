package basic.loopStatement.answer12;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String sentense = "";

        while((sentense = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(sentense);
            int result = 0;
            while(stringTokenizer.hasMoreTokens() == true)
                result += Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(result + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
