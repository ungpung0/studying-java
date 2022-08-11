package chapter04;

public class Question02 {

    public static void main(String[] args) {
        int current = 1, result = 0;
        while(current <= 1000) {
            if(current % 3 == 0) {
                result += current;
            }
            current++;
        }
        System.out.println(result);
    }

}
