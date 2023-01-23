package _12_VisitorPattern;

public interface Element {
  public abstract void accept(Visitor v);
}
