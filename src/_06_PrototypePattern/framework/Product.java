package _06_PrototypePattern.framework;

/* Product 인터페이스 , 복제가 가능하다 (Cloneable) */
public interface Product extends Cloneable{
  public abstract void use(String s);
  public abstract Product createClone();
}
