package basic.basicMath2.answer04;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    boolean eratosthenes(int number) {
        boolean result = false;
        if(number == 1)
            result = false;
        else if(number <= 3)
            result = true;
        else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    result = false;
                    break;
                }
                else
                    result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 최대값(numberMax), 최소값(numberMin) 입력.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberMin = Integer.parseInt(stringTokenizer.nextToken());
        int numberMax = Integer.parseInt(stringTokenizer.nextToken());

        // 숫자 목록 생성.
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = numberMin; i <= numberMax; i++)
            numberList.add(i);

        // 합성수 삭제 및 출력.
        Main main = new Main();
        for(int i = 0; i < numberList.size(); i++) {
            boolean result = main.eratosthenes(numberList.get(i));
            if(result == true)
                bufferedWriter.write(numberList.get(i) + "\n");
            else
                continue;
        }

        // 버퍼 종료.
        bufferedReader.close();
        bufferedWriter.close();
    }

}
