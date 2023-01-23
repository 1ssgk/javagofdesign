package _05_SingletonPattern;

public class Singleton {
  /* Singleton 생성 */
  private static Singleton singleton = new Singleton();

  private Singleton(){
    System.out.println("Created Singleton");
  }

  /* Singleton 가져오기 */
  public static Singleton getInstance(){
    return singleton;
  }
}
