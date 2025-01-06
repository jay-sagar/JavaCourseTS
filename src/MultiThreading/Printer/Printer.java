package MultiThreading.Printer;

interface Printable{
    void print(String doc, String name);
}

public class Printer implements Printable {

    @Override
    public void print(String doc,String name) {

//        synchronized(Printer.class) { // we synchronized it, it will run in queue wise
            System.out.println("Started printing "+doc+" of "+name);

            for(int i =1;i<=10;i++) {
                try {
                    Thread.sleep(500);
                }catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.println(Thread.currentThread().getId()+" is printing "+doc);

            }

            System.out.println(Thread.currentThread().getId()+" is finished printing "+doc+" of "+name);
//        }

    }

}