package _19_FlyweightPattern;

import java.util.HashMap;

public class BigCharFactory {
  private static BigCharFactory singletone = new BigCharFactory();
  private HashMap pool = new HashMap();

  public BigCharFactory(){

  }

  public static BigCharFactory getInstance(){
    if(singletone==null)singletone = new BigCharFactory();
    return singletone;
  }

  public synchronized BigChar getBigChar(char charname){
    BigChar bc = (BigChar) pool.get(""+charname);
    if(bc==null){
      bc = new BigChar(charname);
      pool.put(""+charname,bc);
    }
    return bc;
  }
}
