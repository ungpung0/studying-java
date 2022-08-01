package basic.basicMath1.answer07;

import java.io.*;

public class Main {

    int delivery(int killogram) {
        int count = killogram / 5;
        if(killogram % 5 == 0) {
            return count;
        }else {
            for(int i = 0; i < killogram / 5; i++) {
                int result = count * 5;
                if((killogram - result) % 3 == 0)
                    return count + (killogram - result) / 3;
                count--;
            }
            if(killogram % 3 == 0)
                return killogram / 3;
            else
                return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Main main = new Main();
        bufferedWriter.write(String.valueOf(main.delivery(Integer.parseInt(bufferedReader.readLine()))));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
