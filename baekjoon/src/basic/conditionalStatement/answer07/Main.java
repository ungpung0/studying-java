package basic.conditionalStatement.answer07;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] array = new int[3];
        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens())
                array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int result = 0;
        if(array[0] == array[1] && array[1] == array[2])
            result = 10000 + array[0] * 1000;
        else if(array[0] == array[1] && array[1] != array[2])
            result = 1000 + array[0] * 100;
        else if(array[0] == array[2] && array[0] != array[1])
            result = 1000 + array[0] * 100;
        else if(array[1] == array[2] && array[0] != array[1])
            result = 1000 + array[1] * 100;
        else {
            if(array[0] > array[1] && array[0] > array[2])
                result = array[0] * 100;
            else if(array[1] > array[0] && array[1] > array[2])
                result = array[1] * 100;
            else
                result = array[2] * 100;
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
