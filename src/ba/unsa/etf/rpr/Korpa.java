package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;

    public Korpa() {
        artikli = new Artikl[50];
    }

    public boolean dodajArtikl(Artikl a) {
        for (int i=0; i<artikli.length;i++)
            if (artikli[i]==null) {artikli[i]=a; return true;}
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i=0; i<artikli.length;i++)
    if (artikli[i]!=null && artikli[i].getKod().equals(kod))
    {
    Artikl izbacena = artikli[i];
    artikli[i]=null;
    return izbacena;
    }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena=0;
        for (Artikl a:artikli) if (a!=null)  cijena=cijena+a.getCijena();
        return cijena;
    }
}
