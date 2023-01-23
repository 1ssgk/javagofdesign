package _09_BridgePattern;

/* Display에서 사용할 기능들 */
public class Display {
  private DisplayImpl impl;

  public Display(DisplayImpl impl) {
    this.impl = impl;
  }

  public void open() {
    impl.rawOpen();
  }

  public void print() {
    impl.rawPrint();
  }

  public void close() {
    impl.rawClose();
  }

  public final void display() {
    open();
    print();
    close();
  }
}
