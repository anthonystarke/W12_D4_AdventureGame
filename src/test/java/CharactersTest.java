import Characters.Barbarian;
import Characters.Dwarve;
import Characters.Knight;
import Weapons.Axe;
import Weapons.Hammer;
import Weapons.MeleeWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CharactersTest {

    Sword sword;
    Axe axe;
    Hammer hammer;

    Knight knight;
    Barbarian barbarian;
    Dwarve dwarve;

    @Before
    public void before(){
        sword = new Sword(10);
        axe = new Axe(10);
        hammer = new Hammer(10);

        knight = new Knight("Sir John", 20, sword);
        dwarve = new Dwarve("John", 20, hammer);
        barbarian = new Barbarian("Emil", 20, axe);

    }

    @Test
    public void canGetName(){
        assertEquals("John", dwarve.getName());
        assertEquals("Emil", barbarian.getName());
        assertEquals("Sir John", knight.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(20, dwarve.getHealth());
        assertEquals(10, barbarian.getHealth());
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void canSetHealth(){
        knight.setHealth(15);
        dwarve.setHealth(15);
        barbarian.setHealth(15);

        assertEquals(15,knight.getHealth());
        assertEquals(15,dwarve.getHealth());
        assertEquals(15,barbarian.getHealth());
    }

    @Test
    public void canAttack(){
        assertEquals(10,knight.attack());
        assertEquals(10,dwarve.attack());
        assertEquals(10,barbarian.attack());
    }

    @Test
    public void canTakeDamage(){
        knight.reduceHealth(dwarve.attack());
        dwarve.reduceHealth(knight.attack());
        barbarian.reduceHealth(dwarve.attack());

        assertEquals(10,knight.getHealth());
        assertEquals(10,dwarve.getHealth());
        assertEquals(10,barbarian.getHealth());
    }

}
