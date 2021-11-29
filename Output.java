package edu.prog;
import java.io.*;

public class Output {

    public static void Write(String[] myarr) throws IOException {
        FileWriter out = new FileWriter("Floyd.txt");

        for (String kecske: myarr) {
            out.write(kecske+"\n");
        }
        out.close();
    }
}
