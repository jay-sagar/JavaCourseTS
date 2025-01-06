package MultiThreading;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread started...." + Thread.currentThread().getId());
        }
    }


    public static void main(String[] args) {
        RunnableThread mt1 = new RunnableThread();
        Thread t1 = new Thread(mt1);
        t1.start();

        RunnableThread mt2 = new RunnableThread();
        Thread t2 = new Thread(mt2);
        t2.start();
    }
}
