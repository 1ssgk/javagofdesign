package _17_MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Memento {
  int money;
  ArrayList fruits;

  Memento(int money) {
    this.money = money;
    this.fruits = new ArrayList<>();
  }

  public int getMoney() {
    return money;
  }

  ArrayList getFruits() {
    return fruits;
  }

  void addFruits(String fruit) {
    fruits.add(fruit);
  }

  List getFruit() {
    return (List) fruits.clone();
  }
}
