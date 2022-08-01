package basic.basicMath2.answer04;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // 최대값(numberMax), 최소값(numberMin) 입력.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberMin = Integer.parseInt(stringTokenizer.nextToken());
        int numberMax = Integer.parseInt(stringTokenizer.nextToken());

        // 숫자 목록 생성.
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = numberMin; i <= numberMax; i++)
            numbers.add(i);

        // 소수 검증 및 출력.
        int devide = 2;




        // 버퍼 종료.
        bufferedReader.close();
        bufferedWriter.close();
    }

}
