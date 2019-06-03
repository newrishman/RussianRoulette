package Roulette;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllRegulationsTest {
    @Test
    public void testAllRegulationsChoice() {
        AllRegulations allRegulations = new AllRegulations();
        int x = allRegulations.choice(2);
        assertEquals("Если входные параметры 1 или 2, возвращается входной параметр", 2, x);
        x = allRegulations.choice(-1000);
        assertEquals("Если некорректный параметр, вызывается ошибка и возвращается ноль", 0, x);
    }

    @Test
    public void testAllRegulationsQuantity() {
        AllRegulations allRegulations = new AllRegulations();
        int x = allRegulations.quantity(1);
        assertEquals("Если входные параметры 1 или 2, возвращается входной параметр", 1, x);
        x = allRegulations.quantity(1000);
        assertEquals("Если некорректный параметр, вызывается ошибка и возвращается ноль", 0, x);
    }

}