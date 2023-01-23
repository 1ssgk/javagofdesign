package _04_FactoryMethodPattern.idcard;

import java.util.ArrayList;
import java.util.List;

import _04_FactoryMethodPattern.framework.Factory;
import _04_FactoryMethodPattern.framework.Product;

/* ID 카드 생산 과정 */
public class IDCardFactory extends Factory{
  private List owners = new ArrayList<>();

  /* 제품 생산하기 */
  @Override
  protected Product createProduct(String owner) {
    // TODO Auto-generated method stub
    return new IDCard(owner);
  }

  /* 제품 등록하기 */
  @Override
  protected void registerProduct(Product p) {
    // TODO Auto-generated method stub
    owners.add(((IDCard)p).getOwner());  
  }

  /* 등록된 소유자 리스트 반환 */
  public List getOwners(){
    return owners;
  }

}
