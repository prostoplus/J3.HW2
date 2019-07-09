package HW3;

import java.io.*;

public class DeleteFile {

    public static void main(String[] args) {

        File myLog = new File("ChatLogs.txt");

        if (myLog.delete()){
            System.out.println("File deleting successfully.");
        } else {
            System.out.println("File not found.");
        }
    }
}