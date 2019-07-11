package HW3;

import java.io.*;

public class DeleteText {

    public static void main(String[] args) {

        File myLog = new File("ChatLogs.txt");

        try { BufferedWriter writer = new BufferedWriter(new FileWriter(myLog));
            writer.write(" ");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
