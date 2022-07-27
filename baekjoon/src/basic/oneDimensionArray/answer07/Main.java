package basic.oneDimensionArray.answer07;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int countAll = Integer.parseInt(bufferedReader.readLine());
        String[] arrayAll = new String[countAll];
        for(int i = 0; i < arrayAll.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            double[] arrayDouble = new double[stringTokenizer.countTokens() - 1];
            double divide = Integer.parseInt(stringTokenizer.nextToken()), average = 0, result = 0;
            for(int j = 0; j < divide; j++) {
                if(stringTokenizer.hasMoreTokens())
                    arrayDouble[j] = Integer.parseInt(stringTokenizer.nextToken());
                average += arrayDouble[j];
            }
            average /= arrayDouble.length;
            for(int j = 0; j < divide; j++) {
                if(arrayDouble[j] > average)
                    result++;
            }
            bufferedWriter.write(String.format("%.3f", result / divide * 100) + "%\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
