package HW6;

import java.io.IOException;
import java.util.logging.*;

public class Logging {

    private static final Logger logger = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {

        try {

            Handler h = new FileHandler("mylogsimple.log");
            h.setFormatter(new SimpleFormatter());
            logger.addHandler(h);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Server is on.");
        logger.log(Level.SEVERE, "Сервер запустился..");

        System.out.println("Error message.");
        logger.log(Level.SEVERE, "Сообщение об ошибке..");

        System.out.println("Client connected.");
        logger.log(Level.SEVERE, "Подключился клиент..");

        System.out.println("Receive message from Client: Hello!");
        logger.log(Level.SEVERE, "Получено сообщение/команда от клиента..");

        System.out.println("Receive message from Client: How are you?");
        logger.log(Level.SEVERE, "Получено сообщение/команда от клиента..");

        System.out.println("Client exit from chat.");
        logger.log(Level.SEVERE,"Клиент вышел из чата..");

    }
}
