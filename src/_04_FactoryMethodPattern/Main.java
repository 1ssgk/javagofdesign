package _04_FactoryMethodPattern;

import _04_FactoryMethodPattern.framework.Factory;
import _04_FactoryMethodPattern.framework.Product;
import _04_FactoryMethodPattern.idcard.IDCardFactory;

public class Main {
  public static void main(String[] args){
     /*4. 팩토리 메소드 패턴 - Factory Method Pattern ###############*/
     System.out.println("4. 팩토리 메소드 패턴 - Factory Method Pattern ###############");
        
     /* 생산(추상) : IDCard(상속)  */
     Factory factory = new IDCardFactory();
     /* IDCard 공정을 통해 만들어진 제품. */
     Product card1 = factory.create("김원석");
     Product card2 = factory.create("기먼스");
     System.out.println("-----------------------");
     card1.use();
     card2.use();

     System.out.println("########################################################");
     /* ########################################################*/
  }
}
