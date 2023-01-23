package _04_FactoryMethodPattern.idcard;

import _04_FactoryMethodPattern.framework.Product;

/* ID 카드에 관련된 기능 , Product를 상속 */
public class IDCard extends Product{
  private String owner;

  /* 카드 제작 */
  public IDCard(String owner){
    System.out.println(owner+ " 의 카드를 만듭니다.");
    this.owner = owner;
  }

  /* 카드 사용 */
  @Override
  public void use() {
    // TODO Auto-generated method stub
    System.out.println(owner+" 의 카드를 사용합니다.");
  }

  /* 소유자 확인 */
  public String getOwner(){
    return owner;
  }  
}
