import Characters.Barbarian;
import Characters.Dwarve;
import Characters.Knight;
import Weapons.Axe;
import Weapons.MeleeWeapon;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharactersTest {

    Knight knight;
    Sword sword;
    Axe axe;
    Barbarian barbarian;
    Dwarve dwarve;

    @Before
    public void before(){
        sword = new Sword(10);
        knight = new Knight("Sir John", 100, sword);
        axe = new Axe(10);
        dwarve = new Dwarve("John", 20, axe);
        barbarian = new Barbarian("Emil", 10, axe);


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


}
