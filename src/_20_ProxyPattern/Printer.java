package _20_ProxyPattern;

public class Printer implements Printable{
  private String name;

  public Printer(){
    heavyJob("Printer의 인스턴스 생성 중");
  }

  public Printer(String name){
    this.name = name;
    heavyJob("Printer의 인스턴스 ("+name+") 생성 중");
  }

  public void setPrinterName(String name){
    this.name = name;
  }

  public String getPrinterName(){
    return name;
  }

  public void print(String string){
    System.out.println("==="+name+"===");
    System.out.println(string);
  }

  private void heavyJob(String msg){
    System.out.println(msg);
    for(int i = 0; i<5; i++){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(".");
    }
    System.out.println("완료. ");

  }
}
