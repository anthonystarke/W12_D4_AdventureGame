package Player;

import Armor.Armor;
import Weapons.IWeapon;
import Weapons.MeleeWeapon;

import static java.lang.Math.ceil;

public abstract class Melee extends Player {

    protected IWeapon weapon;
    protected Armor armor;

    public Melee(String name, int health, IWeapon weapon, Armor armor){
        super(name,health);
        this.weapon = weapon;
        this.armor = armor;
    }

    public int attack(){
       return this.weapon.attack();
    }

    public int getArmorCount(){
        return armor.getArmorCount();
    }

    public void reduceHealth(int amount){
        this.health -= amount;
    }

    public void takingDamage(int amount){
        if (amount > this.getArmorCount()){
            int damage = amount - this.getArmorCount();
            this.reduceHealth(damage);
        }

    }

}
