package HW4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {

    public static void main(String[] args) {

        new ExecutorServiceEx();
    }

    private final int Count = 5;

    public ExecutorServiceEx() {

        CountDownLatch cdl1 = new CountDownLatch(Count);
        CountDownLatch cdl2 = new CountDownLatch(Count);
        CountDownLatch cdl3 = new CountDownLatch(Count);

        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new MyThread(cdl1, "A"));
        executorService.execute(new MyThread(cdl2, "B"));
        executorService.execute(new MyThread(cdl3, "C"));
        executorService.shutdown();
    }

    class MyThread implements Runnable {
        String name;
        CountDownLatch latch;

        void print() {
            System.out.print("A B C ");
        }

        public MyThread(CountDownLatch latch, String name) {
            this.name = name;
            this.latch = latch;
            new Thread(this);
        }

        public void run() {
//            try {
//               for (int i = 0; i < Count; i++) {
                    print();
            print();
            print();

//                    latch.countDown();
//                    Thread.sleep(50);
//                }
//                print();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

/**
    Дебильный вариант кода, но так и не смог додуматься как им выставить очередь. Нагуглил, что есть метод Queue,
 но так и не понял как им воспользоваться. Кстати, если будет время, то объясните, пожалуйста.
    Если расскоментить код и убрать два лишних принта, то со слипом в 50 мс будет очень похоже на A B C, но далеко
 от идеала. Опять же, если будет время и возможность, то покажите правильное решение на уроке, пожалуйста.
 */