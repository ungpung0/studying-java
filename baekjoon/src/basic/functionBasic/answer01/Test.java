package basic.functionBasic.answer01;

public class Test {

    long sum(int[] a) {
        int result = 0;
        for(int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}
