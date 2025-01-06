package MultiThreading.Printer;

class Student extends Thread{
    Printer printer;
    String document;
    String name;

    Student(Printer printer, String doc, String name){
        this.printer = printer;
        this.document = doc;
        this.name = name;
    }

    public void run() {
        printer.print(document,name);
    }
}
public class PrinterApp {

    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Student s1 = new Student(sharedPrinter, "Resume","Smith");

        Student s2 = new Student(sharedPrinter, "Resume","John");

        Student s3 = new Student(sharedPrinter, "Resume","Virat");

        s1.start();
        s2.start();
        s3.start();
    }

}
