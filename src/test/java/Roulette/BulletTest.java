package Roulette;

import org.junit.Test;

import static org.junit.Assert.*;

public class BulletTest {
    @Test
    public void testBullet1() {
        Bullet bullet = new Bullet();
        int[] test = bullet.bullet();
        int x = 0;
        for (int i = 0; i < test.length; i++) {
            x += test[i];
        }
        assertEquals("Сумма массива должна ровняться единице", 1, x);
    }

    @Test
    public void testBullet2() {
        Bullet bullet = new Bullet();
        int[] test = bullet.bullet();
        boolean x = false;
        for (int i = 0; i < test.length; i++) {
            if (test[i] == 0 || test[i] == 1) {
                x = true;
            }
        }
        assertEquals("В массиве должны быть только нули и единицы", true, x);
    }

}