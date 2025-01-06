package September.Week4.Batch.OOPS.Abstraction.Interface;

public interface Printer {

    // public static final
    int price = 100;

    void print();
}

class ColorPrinter implements Printer {

    public void print() {
        System.out.println("Printing color papers");
    }
}

class BlackAndWhitePrinter implements Printer {

    public void print() {
        System.out.println("Printing BlackAndWhite papers");
    }
}

class ZamboPrinter implements Printer {

    public void print() {
        System.out.println("Printing zombo papers");
    }
}