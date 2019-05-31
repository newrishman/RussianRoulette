package Roulette;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class UserBangTest {
    @Test
    public void testUserBangStart() throws IOException {
        UserBang userBang = new UserBang();
        int x = userBang.start("   ");
        assertEquals("при корректном вводе, возвращает единицу", 1, x);
    }

    @Test
    public void testUserBangBang() throws IOException {
        UserBang userBang = new UserBang();
        int x = userBang.bang("");
        assertEquals("при корректном вводе, возвращает единицу", 1, x);
    }

}