package _04_FactoryMethodPattern.framework;

/* 공장 추상 */
public abstract class Factory {
  
  /* 제품을 생산한다. */
  public final Product create(String owner){
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  /* 소유자를 이용하여 제품을 만든다. */
  protected abstract Product createProduct(String owner);

  /* 제품을 등록한다. */
  protected abstract void registerProduct(Product p);

}
