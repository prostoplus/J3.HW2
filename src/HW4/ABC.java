package HW4;

public class ABC {

    private static Object lock = new Object();
    private static volatile char current = 'A';

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (lock) {
                        while (current != 'A') {
                            lock.wait();
                        }
                        System.out.print("A ");
                        current = 'B';
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (lock) {
                        while (current != 'B') {
                            lock.wait();
                        }
                        System.out.print("B ");
                        current = 'C';
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (lock) {
                        while (current != 'C') {
                            lock.wait();
                        }
                        System.out.print("C ");
                        current = 'A';
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
