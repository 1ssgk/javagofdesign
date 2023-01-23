package _19_FlyweightPattern;

public class Main {
  public static void main(String[] args){
    args = new String[]{"1221"};
    if(args.length == 0){
      System.out.println("Usage: Java Main digits");
      System.out.println("Exampl: Java Main Flyweight");
      System.exit(0);
    }

    BigString bs = new BigString(args[0]);
    bs.print();
  }
}
