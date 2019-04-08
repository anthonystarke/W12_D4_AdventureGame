package Armor;

public class Armor implements IArmor {

    int armorCount;

    public Armor(int armorCount){
        this.armorCount = armorCount;
    }

    public int getArmorCount() {
        return this.armorCount;
    }

    public void setArmorCount(int value) {
        this.armorCount = value;
    }
}
