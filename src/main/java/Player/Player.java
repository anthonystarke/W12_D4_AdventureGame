package Player;

import Game.IFight;
import Game.ILive;

public abstract class Player implements IFight, ILive {

    protected int health;
    protected String name;

    public Player(){

    }

    public Player(String name,int health) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reduceHealth(int amount){
        this.health -= amount;
    }


}
