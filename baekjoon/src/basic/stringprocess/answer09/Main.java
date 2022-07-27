package basic.stringProcess.answer09;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String templete = "c=c-dz=d-ljnjs=z=";
        String[] input = bufferedReader.readLine().split("");
        int count = 0;
        for(int i = 0; i < input.length; i++) {
            if(templete.indexOf(input[i]) == -1) {

            }else {

            }
        }
        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.close();
        bufferedReader.close();
    }
}

