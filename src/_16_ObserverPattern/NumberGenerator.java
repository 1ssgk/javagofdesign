package _16_ObserverPattern;

import java.util.ArrayList;

public abstract class NumberGenerator {
  private ArrayList observers = new ArrayList<>();

  public void deleteObserver(Observer observer){
    observers.remove(observer);
  }

  public void addObserver(Observer observer){
    observers.add(observer);
  }

  public void notifyObservers(){
    for(Object o : observers){
      Observer observer = (Observer) o;
      observer.update(this);
    }
  }

  public abstract int getNumber();
  public abstract void execute();
}
