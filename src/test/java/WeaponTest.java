import Weapons.Hammer;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Sword sword;
    Hammer hammer;

    @Before
    public void before(){
        sword = new Sword(10);
        hammer = new Hammer(15);
    }

    @Test
    public void canGetAttackDamage(){
        assertEquals(10,sword.attack());
        assertEquals(15,hammer.attack());
    }
}
