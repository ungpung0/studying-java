package basic.stringProcess.answer05;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String sentense = input.readLine().toUpperCase();
        int[] array = new int[26];

        for(int i = 0; i < sentense.length(); i++) {
            int temp = sentense.charAt(i) - 'A';
            array[temp]++;
        }

        int max = -1;
        char result = '?';
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                result = (char)(i + 'A');
            }
            else if(array[i] == max) {
                result = '?';
            }
        }
        output.write(result);

        input.close();
        output.close();
    }
}
