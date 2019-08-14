import com.cookie.Target;
import com.cookie.Weapon;
import org.junit.Test;

import java.nio.file.Watchable;

import static org.junit.Assert.*;

public class MyTestClass {

    @Test
    public void testPhysicalDamage() {

        Target t = new Target();
        Weapon w = new Weapon();
        w.hit(t);

        assertEquals(20, t.getPhysicalDamage());
    }

    @Test
    public void testFireDamage() {

        Target t = new Target();
        Weapon w = new Weapon();
        w.hit(t);

        assertEquals(40, t.getFireDamage());
    }

    @Test
    public void testIceDamage() {

        Target t = new Target();
        Weapon w = new Weapon();
        w.hit(t);

        assertEquals(50, t.getIceDamage());
    }
}