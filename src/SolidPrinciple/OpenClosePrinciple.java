package SolidPrinciple;

// It states that open for extension and close for modification
public class OpenClosePrinciple {
    public static void main(String[] args) {
        Printer p1 = new ColorPrinter();
        p1.print();
    }
}

interface Printer {
    void print();
}

class ColorPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing color papers");
    }
}

class BlackAndWhite implements Printer {
    @Override
    public void print() {
        System.out.println("Printing black and white papers");
    }
}
