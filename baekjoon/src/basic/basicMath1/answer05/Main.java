package basic.basicMath1.answer05;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int count = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int floor = Integer.parseInt(stringTokenizer.nextToken());
            int rooms = Integer.parseInt(stringTokenizer.nextToken());
            int wants = Integer.parseInt(stringTokenizer.nextToken());

            String[][] array = new String[floor][rooms];
            for(int j = 0; j < floor; j++) {
                for(int h = 0; h < rooms; h++) {
                    array[j][h] = String.valueOf(j + 1);
                    if(h < 9)
                        array[j][h] += "0" + (h + 1);
                    else
                        array[j][h] += String.valueOf(h + 1);
                }

            }

            if(wants % floor == 0)
                bufferedWriter.write(array[floor - 1][wants / floor - 1] + "\n");
            else
                bufferedWriter.write(array[wants % floor - 1][wants / floor] + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
