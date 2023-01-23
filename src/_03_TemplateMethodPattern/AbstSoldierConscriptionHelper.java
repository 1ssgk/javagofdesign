package _03_TemplateMethodPattern;

public abstract class AbstSoldierConscriptionHelper {
  protected abstract Citizen consciptionCitizen();

  protected abstract void traning(Citizen citizen);

  protected abstract void supplyEquipment(Soldier soldier);

  protected abstract Soldier changeOfPosition(Citizen citizen);

  public Soldier conscription(){
    Citizen citizen = consciptionCitizen();
    traning(citizen);
    Soldier soldier = changeOfPosition(citizen);
    supplyEquipment(soldier);
    return soldier;
  }
}
