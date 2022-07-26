package basic.oneDimensionArray.answer02;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int highest = 0, count = 1;
        int[] array = new int[9];

        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
            if(i == 0)
                highest = array[i];
            else {
                if(highest < array[i]) {
                    highest = array[i];
                    count = i + 1;
                }
            }
        }
        bufferedWriter.write(highest + "\n" + count);
        bufferedReader.close();
        bufferedWriter.close();
    }

}
