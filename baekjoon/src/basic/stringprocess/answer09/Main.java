package basic.stringProcess.answer09;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < array.length; i++) {
            while(true) {
                if(input.contains(array[i]))
                    input = input.replace(array[i], "X");
                else
                    break;
            }
        }

        bufferedWriter.write(String.valueOf(input.length()));
        bufferedWriter.close();
        bufferedReader.close();
    }

}

