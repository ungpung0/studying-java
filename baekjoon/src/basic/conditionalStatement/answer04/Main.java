package basic.conditionalStatement.answer04;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberX = Integer.parseInt(bufferedReader.readLine());
        int numberY = Integer.parseInt(bufferedReader.readLine());
        if((numberX > 0) && (numberY > 0))      // 1 사분면. (양수, 양수)
            bufferedWriter.write("1");
        else if((numberX < 0) && (numberY > 0)) // 2 사분면. (음수, 양수)
            bufferedWriter.write("2");
        else if((numberX < 0) && (numberY < 0)) // 3 사분면. (음수, 음수)
            bufferedWriter.write("3");
        else                                    // 4 사분면. (양수, 음수)
            bufferedWriter.write("4");

        bufferedReader.close();
        bufferedWriter.close();
    }

}
