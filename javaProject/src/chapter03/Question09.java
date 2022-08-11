package chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Question09 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        TreeSet<Integer> result = new TreeSet<>();
        result.addAll(numbers);
        System.out.println(result);
    }

}
