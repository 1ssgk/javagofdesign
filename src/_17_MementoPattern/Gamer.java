package _17_MementoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
  private int money;
  private List fruits = new ArrayList<>();
  private Random random = new Random();
  private static String[] fruitsname = { "사과", "포도", "바나나", "귤" };

  public Gamer(int money) {
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  public void bet() {
    int dice = random.nextInt(6) + 1;
    if (dice == 1) {
      money += 100;
      System.out.println("소지금이 증가했다.");
    } else if (dice == 2) {
      money /= 2;
      System.out.println("소지금이 절반이 됐다.");
    } else if (dice == 6) {
      String f = getFruit();
      System.out.println("과일(" + f + ")을 받았다.");
      fruits.add(f);
    }
  }

  public Memento createMemento() {
    Memento m = new Memento(money);
    for (Object o : fruits) {
      String f = (String) o;
      if (f.startsWith("맛있는 ")) {
        m.addFruits(f);
      }
    }
    return m;
  }

  public void restoreMemento(Memento memento) {
    this.money = memento.money;
    this.fruits = memento.fruits;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  private String getFruit() {
    String prefix = "";
    if (random.nextBoolean()) {
      prefix = "맛있는 ";
    }
    return prefix + fruitsname[random.nextInt(fruitsname.length)];
  }
}
