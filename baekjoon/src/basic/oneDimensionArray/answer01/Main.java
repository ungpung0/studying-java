package basic.oneDimensionArray.answer01;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine()), highest = 0, lowest = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] array = new int[stringTokenizer.countTokens()];
        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens())
                array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                highest = array[i];
                lowest = array[i];
            }

            highest = (highest >= array[i]) ? highest : array[i];
            lowest = (lowest <= array[i]) ? lowest : array[i];
        }

        bufferedWriter.write(lowest + " " + highest);
        bufferedReader.close();
        bufferedWriter.close();
    }

}
