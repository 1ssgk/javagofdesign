package _06_PrototypePattern.anonymous;

import _06_PrototypePattern.framework.Product;

public class UnderlinePen implements Product{
  private char ulchar;

  public UnderlinePen(char ulchar){
    this.ulchar = ulchar;
  }

  @Override
  public void use(String s) {
    // TODO Auto-generated method stub
    int length = s.getBytes().length;
    System.out.println("\""+ s + "\"");
    System.out.println("");
    for(int i=0; i<length; i++){
      System.out.println(ulchar);
    }
    System.out.println("");
  }

  @Override
  public Product createClone() {
    // TODO Auto-generated method stub
    Product p = null;

    try {
      p = (Product) clone();
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return p;
  }

}
