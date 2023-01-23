package _01_StartegyPattern;

public class Main {
  public static void main (String[] args){
    GameCharacter gameCharacter = new GameCharacter();
    gameCharacter.setWeapon(new Sword());
    gameCharacter.attack();

    gameCharacter.setWeapon(new Knife());
    gameCharacter.attack();
  }  
}
