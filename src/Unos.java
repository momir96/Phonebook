import java.io.Serializable;

public class Unos implements Comparable<Unos>, Serializable {

    private Osoba osoba;
    private BrojTelefona broj;

    public Unos(Osoba osoba, BrojTelefona broj) {
        this.osoba = osoba;
        this.broj = broj;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public BrojTelefona getBroj() {
        return broj;
    }

    public int compareTo(Unos unos) {
        return osoba.compareTo(unos.getOsoba());
    }

    public String toString(){
        return osoba + " " + broj;
    }

    public static Unos ucitajUnos(){
        return new Unos(Osoba.ucitajOsobu(), BrojTelefona.ucitajBrojTelefona());
    }
}
