package Player;

import Weapons.IWeapon;
import Weapons.MeleeWeapon;

public abstract class Melee extends Player {

    protected IWeapon weapon;

    public Melee(String name, int health, IWeapon weapon){
        super(name,health);
        this.weapon = weapon;
    }

    public int attack(){
       return this.weapon.attack();
    }



}
