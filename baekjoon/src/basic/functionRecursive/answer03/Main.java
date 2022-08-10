package basic.functionRecursive.answer03;

import java.io.*;

public class Main {

    static void chatBot(int number, String[] templete) {
        if(number <= 0) {
            System.out.println(templete[0] + "\n" + templete[templete.length - 2]);
            String temp = templete[templete.length - 1];
            while(true) {
                if(temp.charAt(0) == '_') {
                    System.out.println(temp);
                    temp = temp.substring(4, temp.length());
                }
                else {
                    System.out.println(temp);
                    break;
                }
            }
        }else {
            for(int i = 0; i < templete.length; i++) {
                if(i < 4)
                    System.out.println(templete[i]);
                templete[i] = "____" + templete[i];
            }
            number--;
            chatBot(number, templete);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String[] templete = {
                "\"재귀함수가 뭔가요?\""
                , "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
                , "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
                , "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
                , "\"재귀함수는 자기 자신을 호출하는 함수라네\""
                , "라고 답변하였지."
        };

        // 출력.
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        chatBot(number, templete);

        // 종료.
        bufferedReader.close();
    }

}
