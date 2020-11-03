package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
private Supermarket m= new Supermarket();

    private static void napuniSupermarket (Supermarket m) {
        for (int i=1;i<=1000;i++) m.dodajArtikl(new Artikl("Caj",i,((Integer)i).toString()));
    }

    @Test
    void testIzbacivanjaArtikla1() {
        napuniSupermarket(m);
        assertNull(m.izbaciArtiklSaKodom("9999"));
    }

    @Test
    void testIzbacivanjaArtikla2() {
        napuniSupermarket(m);
        assertEquals(m.getArtikli()[998],m.izbaciArtiklSaKodom("999"));
    }
}