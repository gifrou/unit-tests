package cz.itnetwork;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.awt.event.KeyListener;

class KalkulackaTest {

    @Test
    void sectiKladne() {
        Kalkulacka kalkulacka = new Kalkulacka();
        assertEquals(10, kalkulacka.secti(5, 5));
    }

    @Test
    void sectiZaporne() {
        var kalkulacka = new Kalkulacka();
        assertEquals(0, kalkulacka.secti (2, -2));
    }

    @Test
    void sectiNulu() {
        var kalkulacka = new Kalkulacka();
        assertEquals(0, kalkulacka.secti (0, 0));
        assertEquals(0, kalkulacka.secti(-0, 0));
    }

    @Test
    void deleni() {
        var kalkulacka = new Kalkulacka();
        assertEquals(0, kalkulacka.vydel(0, 1));
        assertEquals(2, kalkulacka.vydel(4, 2));
    }

    @Test
    void nasobeni() {
        var kalkulacka = new Kalkulacka();
        assertEquals(0, kalkulacka.vynasob(5,0));
        assertEquals(-1, kalkulacka.vynasob(-1,1));
        assertEquals(1, kalkulacka.vynasob(-1,-1));
    }
}