import java.io.Serializable;
import java.util.Scanner;

public class BrojTelefona implements Serializable {

    private String pozivni;
    private String broj;
    private static Scanner in = new Scanner(System.in);

    public BrojTelefona(String pozivni, String broj) {
        this.pozivni = pozivni;
        this.broj = broj;
    }

    public String toString(){
        return "(" + pozivni + ")" + broj;
    }

    public static BrojTelefona ucitajBrojTelefona(){

        System.out.println("Unesite pozivni broj");
        String pozivni = in.next();
        System.out.println("Unesite broj u lokalu");
        String brULokalu = in.next();
        return new BrojTelefona(pozivni, brULokalu);
    }
}
