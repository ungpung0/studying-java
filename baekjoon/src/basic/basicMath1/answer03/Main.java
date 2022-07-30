package basic.basicMath1.answer03;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    int snailFunction(int up, int down, int top) {
        int daily = up - down;
        if(top % daily )

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] array = new int[stringTokenizer.countTokens()];
        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens())
                array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Main main = new Main();
        int result = main.snailFunction(array[0], array[1], array[2]);
        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
