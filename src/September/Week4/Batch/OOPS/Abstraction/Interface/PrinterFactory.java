package September.Week4.Batch.OOPS.Abstraction.Interface;

// system pattern => factory design pattern
public class PrinterFactory {
    public static Printer getInstance(String printerType) {
        if (printerType.equalsIgnoreCase("ColorPrinter")) {
            return new ColorPrinter();
        } else if (printerType.equalsIgnoreCase("BlackAndWhitePrinter")) {
            return new BlackAndWhitePrinter();
        } else if (printerType.equalsIgnoreCase("ZamboPrinter")) {
            return new ZamboPrinter();
        } else {
            return null;
        }
    }
}
