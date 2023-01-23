package _11_DecoratorPattern;

public class SideBorder extends Border{
  private char borderchar;

  public SideBorder(Display display, char borderchar){
    super(display);
    this.borderchar = borderchar;
  }

  @Override
  public int getColumns() {
    return 1+ display.getColumns();
  }

  @Override
  public int getRows() {
    return display.getRows();
  }

  @Override
  public String getRowText(int row) {
    return borderchar + display.getRowText(row) + borderchar;
  }
}
