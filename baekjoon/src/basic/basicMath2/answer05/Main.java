package basic.basicMath2.answer05;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static int primeCount(int number) {
        int count = 0;
        int max = number * 2;

        for(int i = number + 1; i <= max; i++) {
            if(i == 1) {
                continue;
            }else if(i <= 3) {
                count++;
                continue;
            }else {
                int flag = 0;
                for(int j = 2; j <= Math.sqrt(max); j++) {
                    if(i % j == 0) {
                        flag = 0;
                        break;
                    }
                    else {
                        flag = 1;
                    }
                }
                if(flag == 1)
                    count++;
            }
        }


        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 0까지 리스트 입력.
        ArrayList<Integer> numberList = new ArrayList<>();
        while(true) {
            String number = bufferedReader.readLine();
            if(number.equals("0")) break;
            numberList.add(Integer.parseInt(number));
        }

        // 소수 함수 호출 및 출력.
        for(int i = 0; i < numberList.size(); i++) {
            bufferedWriter.write(primeCount(numberList.get(i)) + "\n");
        }

        // 버퍼 종료.
        bufferedReader.close();
        bufferedWriter.close();
    }

}
