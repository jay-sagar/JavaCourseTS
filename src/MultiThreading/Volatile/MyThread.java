package MultiThreading.Volatile;

//
public class MyThread extends Thread{
    public volatile boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Thread started ......");
        }
        System.out.println("Thread stop");
    }

    public void stopThread() {
        isRunning = false;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        Thread.sleep(1000);

        t1.stopThread();
    }
}
