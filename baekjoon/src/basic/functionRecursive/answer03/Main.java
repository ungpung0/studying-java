package basic.functionRecursive.answer03;

import java.io.*;

public class Main {

    static void chatBot(int number) {
        String symbols = "____";
        for(int i = 0; i < templete.length; i++) {
            templete[i] = symbols + templete[i];
        }

        if()
        else {

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String[] templete = {
                "\"재귀 함수가 뭔가요?\""
                , "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
                , "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
                , "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
                , "\"재귀함수는 자기 자신을 호출하는 함수라네\""
                , "라고 답변하였지."
        };
        for(String data : templete) {
            System.out.println(data);
        }

        bufferedReader.close();
    }

}
