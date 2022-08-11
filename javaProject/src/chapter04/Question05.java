package chapter04;

public class Question05 {

    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        double result = 0;
        for(int data : marks) {
            result += data;
        }
        result /= marks.length;
        System.out.println(result);
    }

}
