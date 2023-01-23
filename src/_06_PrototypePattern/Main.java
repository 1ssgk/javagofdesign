package _06_PrototypePattern;

import _06_PrototypePattern.anonymous.MessageBox;
import _06_PrototypePattern.anonymous.UnderlinePen;
import _06_PrototypePattern.framework.Manager;
import _06_PrototypePattern.framework.Product;

public class Main {

  public static void main(String[] args) {

    /* 6. 프로토 타입 패턴 - Prototype Pattern ############### */
    System.out.println("6. 프로토 타입 패턴 - Prototype Pattern ###############");

    Manager manager = new Manager();
    UnderlinePen upen = new UnderlinePen('~');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('/');
    manager.register("strong message", upen);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);

    Product p1 = manager.create("strong message");
    p1.use("Hellom world.");
    Product p2 = manager.create("warning box");
    p2.use("Hellom world.");
    Product p3 = manager.create("slash box");
    p3.use("slash box");

    System.out.println("########################################################");

    /* ######################################################## */

  }
}
