package basic.stringProcess.answer10;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(bufferedReader.readLine());
        String[] arrayAll = new String[count];
        for(int i = 0; i < arrayAll.length; i++)
            arrayAll[i] = bufferedReader.readLine();

        for(int i = 0; i < arrayAll.length; i++) {
            String[] arrayTemp = arrayAll[i].split("");
            for(int j = 0; j < arrayTemp.length; j++) {

            }
        }


    }

}
