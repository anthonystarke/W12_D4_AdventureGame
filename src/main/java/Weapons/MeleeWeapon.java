package Weapons;

public abstract class MeleeWeapon implements IWeapon{

    protected int attackDamage;

    public MeleeWeapon(int attackDamage){
        this.attackDamage = attackDamage;
    }

    public int attack(){
        return this.attackDamage;
    }
}
