package MultiThreading;


// Two ways to implement thread class
// 1. extend Thread class
// 2. implements Runnable interface

// wait, sleep, yield, notify, notify all - list all the method of object class

// yield = In Java, the yield() method is a static method of the Thread class. It is used to suggest to the thread scheduler that the current thread is willing to relinquish its current use of a processor, allowing other threads of the same or higher priority to execute.
//Hint, not a guarantee: The scheduler is free to ignore this hint, meaning that yield() does not guarantee that another thread will immediately run.
//Same or higher priority: yield() only gives up control to threads of the same or higher priority.
//Use sparingly: Overuse of yield() can lead to unpredictable behavior and performance issues.

// wait = it causes the current thread to wait until the another thread calls/invokes notify or notify all method on a same object
//          it releases the lock on an object and enters into waiting state
            // wait for the specify time before continuing if not notified

// sleep = it causes the current thread to sleep for a specified amount of time without releasing the lock

// notify = it notify the single thread which is waiting for the object

// notify all = it notify all the thread which is waiting for the object

public class MyThread extends Thread{
    // running state
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000); // waiting state
            } catch (InterruptedException e) { // checked exception
                throw new RuntimeException(e);
            }
            System.out.println("Thread started..." + Thread.currentThread().getId());
        }
    } // dead state, terminate state
    public static void main(String[] args) {
        MyThread mt1 = new MyThread(); // new state
        mt1.start(); // runnable


        MyThread mt2 = new MyThread();
        mt2.start();
    }
}
