package basic.oneDimensionArray.answer04;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        final int divide = 42;
        int[] array = new int[10];
        int count = 1;
        for(int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(bufferedReader.readLine()) % divide;

        for(int i = 0; i < (array.length - 1); i++) {
            int flag = 1;
            for(int j = (i + 1); j < array.length; j++) {
                if(array[i] == array[j]) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                count++;
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
