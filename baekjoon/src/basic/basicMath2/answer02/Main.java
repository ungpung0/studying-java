package basic.basicMath2.answer02;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 최소값(minNumber), 최대값(maxNumber) 입력받고 리스트 생성하기.
        int minNumber = Integer.parseInt(bufferedReader.readLine());
        int maxNumber = Integer.parseInt(bufferedReader.readLine());
        LinkedList<Integer> numbers = new LinkedList<>();
        for(int i = minNumber; i <= maxNumber; i++) {
            numbers.add(i);
        }

        // 리스트 검색하여 소수가 아닌 수 삭제하기.
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            int number = iterator.next();

            if(number == 1) {
                iterator.remove();
                continue;
            }else if(number == 2) {
                continue;
            }else {
                for(int i = 2; i < number; i++) {
                    if(number % i == 0) {
                        iterator.remove();
                        break;
                    }
                }
            }
        }

        // 총합(result) 구하기.
        int result = 0;
        iterator = numbers.iterator();
        while(iterator.hasNext()) {
            result += iterator.next();
        }

        // 출력하고 버퍼 종료하기.
        if(result == 0) {
            bufferedWriter.write("-1");
        }else {
            bufferedWriter.write(result + "\n" + numbers.get(0));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

}
