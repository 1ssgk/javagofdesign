package _11_DecoratorPattern;

public class Main {
  public static void main(String[] args) {
    StringDisplay b1 = new StringDisplay("Hello, world");
    SideBorder b2 = new SideBorder(b1, '#');
    FullBorder b3 = new FullBorder(b2);
    b1.show();
    System.out.println("---------------------------------------");
    b2.show();
    System.out.println("---------------------------------------");

    b3.show();
    System.out.println("---------------------------------------");

    Display b4 = new SideBorder(
        new FullBorder(
            new FullBorder(
                new SideBorder(
                    new FullBorder(
                        new StringDisplay("안녕하세요.")),
                    '2'))),
        '1');
    b4.show();

  }
}
