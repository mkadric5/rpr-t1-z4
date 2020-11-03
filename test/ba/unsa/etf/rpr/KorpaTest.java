package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
   private Korpa k=new Korpa();

   private static void napuniKorpu (Korpa k) {
       for (int i=1;i<=50;i++) k.dodajArtikl(new Artikl("Caj",i,((Integer)i).toString()));
   }

   @Test
    public void TestDodavanjaArtikla1 (){      //Ovo je test da li metoda ispravno vraca vrijednos false kad je korpa puna
       napuniKorpu(k);
       assertFalse(k.dodajArtikl(new Artikl("Caj",51,"51")));
   }
    @Test
    public void TestDodavanjaArtikla2 (){      //Ovo je test da li metoda ispravno vraca vrijednos true kad korpa nije puna
        assertTrue(k.dodajArtikl(new Artikl("Caj",51,"51")));
    }
    @Test
    public void TestIzbacivanjaArtikla1 (){      //Testira vracanje null reference jer artikla s datim kodom nema u korpi
       napuniKorpu(k);
       assertNull(k.izbaciArtiklSaKodom("99"));
    }
    @Test
    public void TestIzbacivanjaArtikla2 (){       //Testira vracanje reference na izbacen artikl
        napuniKorpu(k);
        assertEquals(k.getArtikli()[19],k.izbaciArtiklSaKodom("20"));
    }

   @Test
    public void TestVracanjaCijeneArtikalaUKorpi (){
       napuniKorpu(k);
       int cijena=0;
       for (Artikl x: k.getArtikli()) cijena = cijena + x.getCijena();
       assertEquals(cijena, k.dajUkupnuCijenuArtikala());
   }
}