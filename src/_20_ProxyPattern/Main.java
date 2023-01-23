package _20_ProxyPattern;

public class Main {
  public static void main(String[] args) {
    Printable p = new PrinterProxy("Hansol");
    System.out.println("이름은 현재" + p.getPrinterName() + "입니다.");
    p.setPrinterName("Catsbi");
    System.out.println("이름은 현재" + p.getPrinterName() + "입니다.");
    p.print("Hello, world");
  }
}
