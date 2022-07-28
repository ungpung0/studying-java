package basic.basicMath1.answer01;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long[] array = new long[3];

        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens()) {
                array[i] = Long.parseLong(stringTokenizer.nextToken());
            }
        }

        long costProfit = array[2] - array[1];

        if(costProfit <= 0)
            bufferedWriter.write("-1");
        else
            bufferedWriter.write(String.valueOf(array[0] / costProfit + 1));

        bufferedReader.close();
        bufferedWriter.close();
    }

}
