package _03_TemplateMethodPattern;

public class SoldierConscriptionHelperImpl extends AbstSoldierConscriptionHelper{
  @Override
  protected Citizen consciptionCitizen() {
    System.out.println("모집합니다.");
    return new Citizen();
  }

  @Override
  protected void traning(Citizen citizen) {
    citizen.updateStrength(5);
    citizen.updateAgility(4);
    citizen.updateIntelligence(-3);
    System.out.println("병사 훈련");
  }

  @Override
  protected void supplyEquipment(Soldier soldier) {
    soldier.setWeapon(new Gun());
    soldier.setArmor(new SteelArmor());
    System.out.println("장비 착용");    
  }

  @Override
  protected Soldier changeOfPosition(Citizen citizen) {
    System.out.println("시민 -> 병사 변경!");
    return new Soldier(citizen);
  }
}
