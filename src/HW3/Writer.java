package HW3;

import java.io.*;

public class Writer {

    public static void main(String[] args) {

        File myLog = new File("ChatLogs.txt");
        int n = 1;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myLog));
            while (n != 151) writer.write("Message " + "#" + n++ + "\n");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}