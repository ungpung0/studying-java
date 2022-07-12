package basic.stringprocess.answer06;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sentense = bufferedReader.readLine();
        int count = 0, length = sentense.length(), temp = 0;

        for(int i = 0; i < length; i++) {
            char curr = sentense.charAt(i);

            if(i > 0) {
                char prev = sentense.charAt(i - 1);
                if(curr != )
                }
            }
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.close();
        bufferedReader.close();
    }
}
