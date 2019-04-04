import Weapons.Shield;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShieldTest {

    Shield shield;

    @Before
    public void before(){
        shield = new Shield(10);
    }

    @Test
    public void setGetShield(){
        shield.setProtectionLevel(9);
        assertEquals(9, shield.getProtectionLevel());
    }

}
