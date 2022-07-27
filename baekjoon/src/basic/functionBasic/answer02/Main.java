package basic.functionBasic.answer02;

import java.io.IOException;
import java.util.HashSet;

public class Main {

    int selfNumber(int number) {
        String[] array = String.valueOf(number).split("");
        int result = number;
        for(int i = 0; i < array.length; i++) {
            result += Integer.parseInt(array[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 1; i < 10000; i++)
            hashSet.add(i);

        for(int i = 1; i < 10000; i++) {
            hashSet.remove(main.selfNumber(i));
        }

        for(int data : hashSet)
            System.out.println(data);
    }

}
