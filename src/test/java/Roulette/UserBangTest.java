package Roulette;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserBangTest {
    @Test
    public void testUserBangStart() {
        UserBang userBang = new UserBang();
        int x = userBang.start("   ");
        assertEquals("при корректном вводе, возвращает единицу", 1, x);
    }

    @Test
    public void testUserBangBang() {
        UserBang userBang = new UserBang();
        int x = userBang.bang("");
        assertEquals("при корректном вводе, возвращает единицу", 1, x);
    }

}