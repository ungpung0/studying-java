package basic.operationArithmetic.answer13;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String[] array = number2.split("");
        int result = 0;
        for(int i = (array.length - 1); i > -1; i--) {
            result = Integer.parseInt(number1) * Integer.parseInt(array[i]);
            bufferedWriter.write(String.valueOf(result) + "\n");
        }
        result = Integer.parseInt(number1) * Integer.parseInt(number2);
        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }

}
