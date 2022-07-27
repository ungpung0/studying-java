package basic.oneDimensionArray.answer05;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());
        double[] array = new double[count];
        double highest = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens())
                array[i] = Integer.parseInt(stringTokenizer.nextToken());

            if(i == 0)
                highest = array[i];
            else
                if(highest < array[i])
                    highest = array[i];
        }

        double result = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] / highest * 100;
            result += array[i];
        }

        bufferedWriter.write(String.valueOf(result / count));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
