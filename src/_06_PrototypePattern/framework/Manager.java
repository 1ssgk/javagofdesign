package _06_PrototypePattern.framework;

import java.util.HashMap;

public class Manager {
  private final HashMap<String,Product> showcase = new HashMap<>();

  /* Product를 등록한다. */
  public void register(String name, Product proto){
    showcase.put(name, proto);
  }

  /* Product와 같은 이름의 제품을 복제해서 만들어준다. */
  public Product create(String protoname){
    Product p = showcase.get(protoname);
    return p.createClone();
  }
}
