package Rooms;


import Enemies.Enemy;

public class Room {

    private String treasure;
    private Enemy enemy;

    public Room(String treasure, Enemy enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }


}
