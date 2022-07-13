package basic.stringprocess.answer08;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] dialNumber = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String dialInput = bufferedReader.readLine();
        int result = 0;
        for(int i = 0; i < dialInput.length(); i++) {
            char dialData = dialInput.charAt(i);
            for(int j = 0; j < dialNumber.length; j++) {
                if(dialNumber[j].indexOf(dialData) >= 0)
                    result += (j + 3);
            }
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
