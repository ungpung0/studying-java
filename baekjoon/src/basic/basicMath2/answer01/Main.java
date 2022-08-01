package basic.basicMath2.answer01;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력하기.
        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 배열로 저장하기.
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            if(stringTokenizer.hasMoreTokens())
                array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        // 소수 판단하기.
        int result = array.length;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                result--;
                continue;
            }else if(array[i] == 2) {
                continue;
            }else {
                for(int j = 2; j < array[i]; j++) {
                    if(array[i] % j == 0) {
                        result--;
                        break;
                    }
                }
            }
        }

        // 출력하기.
        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();

    }

}
