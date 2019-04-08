package Characters;

import Armor.Armor;
import Player.Melee;
import Weapons.Axe;

public class Barbarian extends Melee {

    public Barbarian(String name, int health, Axe axe, Armor armor) {
        super(name, health, axe, armor);
    }
}
