package _09_BridgePattern;

public class CountDisplay extends Display {

  /* Display를 확장해서 부모(=Display)에게 DisplayImpl 전달 */
  public CountDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void multiDisplay(int times) {
    open();
    for (int i = 0; i < times; i++) {
      print();
    }
    close();
  }
}
