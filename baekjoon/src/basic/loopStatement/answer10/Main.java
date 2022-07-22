package basic.loopStatement.answer10;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int count = Integer.parseInt(stringTokenizer.nextToken());
        int max = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens()) {
                array[i] = Integer.parseInt(stringTokenizer.nextToken());
                if(array[i] < max)
                    bufferedWriter.write(array[i] + " ");
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}
