package basic.oneDimensionArray.answer06;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());
        String[] array = new String[count], temp;
        for(int i = 0; i < array.length; i++) {
            array[i] = bufferedReader.readLine();
            temp = array[i].split("");
            int rate = 0, result = 0;
            for(int j = 0; j < temp.length; j++) {
                if(temp[j].equals("O")) {
                    rate++;
                }else {
                    rate = 0;
                }
                result += rate;
            }
            bufferedWriter.write(result + "\n");
            temp = null;
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}
