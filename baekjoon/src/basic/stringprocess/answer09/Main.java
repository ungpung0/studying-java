package basic.stringprocess.answer09;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String sentense = bufferedReader.readLine();
        int count = 0;
        for(int i = 0; i < sentense.length(); i++) {
            char current = sentense.charAt(i);
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.close();
        bufferedReader.close();
    }
}

