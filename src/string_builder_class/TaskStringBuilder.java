package string_builder_class;

import java.util.Scanner;

public class TaskStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text:");
        String inData=scanner.nextLine();

        String result=trimSpaces2(inData);

        System.out.println("result = " + result);
    }

    private static String trimSpaces(String inString){
        StringBuilder sb=new StringBuilder(inString);

        int index;
        while ((index=sb.indexOf("  "))!=-1){
            sb.deleteCharAt(index);
        }

        return sb.toString();
    }

    private static String trimSpaces2(String inString){
        StringBuilder sb=new StringBuilder(inString);
        StringBuilder sbResult=new StringBuilder(sb.length());

        char prevChar=sb.charAt(0);
        sbResult.append(prevChar);
        for (int i = 1; i < sb.length(); i++) {
            char currChar=sb.charAt(i);
            if(prevChar!=' '&&currChar!=' '){
                sbResult.append(currChar);
            }
            prevChar=currChar;


        }
        return sbResult.toString();
    }
}
