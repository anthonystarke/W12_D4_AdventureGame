package Enemies;

import Game.IFight;
import Game.ILive;
import Weapons.IWeapon;

public class Enemy implements IFight, ILive {

    protected int health;
    protected IWeapon weapon;


    public Enemy(int health, IWeapon weapon){
        this.health = health;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void reduceHealth(int amount){
        this.health -= amount;
    }

    public int attack(){
        return this.weapon.attack();
    }
}
