package HW3;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {

        File myLog = new File("ChatLogs.txt");
        BufferedReader reader = null;

        try {reader = new BufferedReader(new FileReader(myLog));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            reader.close();
        }

    }
}


/**
    Объясните, пожалуйста, как использовать .next() и как сделать, чтобы выводилось последние 100 сообщений.
    А то как-то не доходит :\
 */