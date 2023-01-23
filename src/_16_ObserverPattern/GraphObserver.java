package _16_ObserverPattern;

public class GraphObserver implements Observer{
  @Override
  public void update(NumberGenerator numberGenerator) {
    System.out.println("GraphObserver:");
    int count = numberGenerator.getNumber();
    for(int i =0; i< count; i++){
      System.out.print("*");
    }
    System.out.println("");

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}