package edu.prog;

import java.io.IOException;
import java.nio.channels.CancelledKeyException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            Input num = new Input();
            int lines = Integer.parseInt(num.reader.readLine());
            String[] myarr =  Calculate.generateTriangle(lines);
            for (String line :
                    myarr) {

                System.out.println(line);
            }
            Output.Write(myarr);
            System.out.println(Calculate.sumRightmost(lines));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}