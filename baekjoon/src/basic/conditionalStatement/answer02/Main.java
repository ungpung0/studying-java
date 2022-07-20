package basic.conditionalStatement.answer02;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testScore = Integer.parseInt(bufferedReader.readLine());

        switch (testScore / 10) {
            case 10:
            case 9:
                bufferedWriter.write("A");
                break;
            case 8:
                bufferedWriter.write("B");
                break;
            case 7:
                bufferedWriter.write("C");
                break;
            case 6:
                bufferedWriter.write("D");
                break;
            default:
                bufferedWriter.write("F");
                break;
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
