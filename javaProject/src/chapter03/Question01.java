package chapter03;

import java.util.ArrayList;

public class Question01 {

    static int average(ArrayList<Integer> arrayList) {
        int result = 0;
        for(int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i);
        }
        result /= arrayList.size();

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>();
        score.add(80);
        score.add(75);
        score.add(55);
        System.out.println(average(score));
    }
}
