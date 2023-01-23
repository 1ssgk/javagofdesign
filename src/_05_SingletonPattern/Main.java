package _05_SingletonPattern;

public class Main {
  public static void main(String[] args){
     /*5. 싱글톤 패턴 - Singleton Pattern ###############*/
     System.out.println("5. 싱글톤 패턴 - Singleton Pattern ###############");
        

     Singleton instance1 = Singleton.getInstance();
     Singleton instance2 = Singleton.getInstance();

     System.out.println("instance1과 instance2 동일성 비교::"+(instance1==instance2));

     System.out.println("########################################################");

     /* ########################################################*/
  }
}
