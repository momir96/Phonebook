import java.io.Serializable;
import java.util.Scanner;

public class Osoba implements Comparable<Osoba>, Serializable {

    private String ime;
    private String prezime;
    private static Scanner in = new Scanner(System.in);

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public int compareTo(Osoba o) {
       int rezultat = prezime.compareTo(o.prezime);
       if (rezultat == 0)
           return ime.compareTo(o.ime);
       return rezultat;
    }

    public boolean equals(Object o){
        return compareTo((Osoba) o) == 0;
    }

    public int hashCode(){
        return 11 * ime.hashCode() + 13 * prezime.hashCode();
    }

    public String toString(){
        return prezime + " " + ime;
    }

    public static Osoba ucitajOsobu(){

        System.out.println("Unesite ime osobe ");
        String ime = in.next();
        System.out.println("Unesite prezime osobe");
        String prezime = in.next();
        return new Osoba(ime, prezime);
    }
}
