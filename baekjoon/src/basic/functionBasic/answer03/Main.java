package basic.functionBasic.answer03;

import java.io.*;

public class Main {

    int hansu(int number) {
        int count = 0;
        if(number < 100) {
            count = number;
        }
        else {
            count = 99;
            for(int i = 100; i <= number; i++) {
                String[] tempString = String.valueOf(i).split("");
                int condition1 = Integer.parseInt(tempString[2]) - Integer.parseInt(tempString[1]);
                int condition2 = Integer.parseInt(tempString[1]) - Integer.parseInt(tempString[0]);
                if(condition1 == condition2)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf(main.hansu(max)));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
