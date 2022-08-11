package chapter03;

public class Question03 {

    public static void main(String[] args) {
        String residentCode = "881120-1068234";
        String codeFront = residentCode.substring(0, 6);
        String codeBack = residentCode.substring(7);
        System.out.println(codeFront + " " + codeBack);
    }

}
