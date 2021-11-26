package edu.prog;

public class Calculate {

    public static String[] generateTriangle(int N){
        int currentNum = 1;
        String[] result = new String[N];
        for (int line = 0; line < N; line++){
            String currentLine = "";
            for (int num = 0; num <= line; num++) {
                currentLine = currentLine + " " + currentNum;
                currentNum++;
            }
            result[line] = currentLine;
        }
        return result ;
    }

    public static Integer sumRightmost(int N){
        int sum = 0;
        int num = 0;
        for (int index = 1; index <= N; index++){
                num += index;
                sum += num;
            }


        return sum ;
    }
}