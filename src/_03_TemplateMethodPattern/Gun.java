package _03_TemplateMethodPattern;

public class Gun implements Weapon{
  @Override
    public void attack() {
        System.out.println("총으로 공격");
    }
}
