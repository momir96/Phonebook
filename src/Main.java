import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Imenik imenik = new Imenik();
        Scanner in = new Scanner(System.in);

        Osoba osoba;

        for (;;){
            System.out.println("Unesite: ");
            System.out.println("1 za novi unos u imenik");
            System.out.println("2 da nadjete broj za ime");
            System.out.println("3 da izlistate sve unose imenika u abecednom poretku");
            System.out.println("0 za kraj programa");

            int opcija = in.nextInt();

            switch (opcija){
                case 1:
                    imenik.dodajUnos(Unos.ucitajUnos());
                    break;

                case 2:
                    osoba = Osoba.ucitajOsobu();
                    Unos unos = imenik.getUnos(osoba);
                    if (unos == null)
                        System.out.println("Ne postoji u imeniku");
                    else
                        System.out.println("Telefon osobe " + osoba + " je " + unos.getBroj());
                    break;

                case 3:
                    imenik.izlistajOsobe();
                    break;

                case 4:
                    imenik.sacuvaj();
                    System.out.println("Kraj programa");
                    return;

                default:
                    System.out.println("Neispravan unos, pokusajte ponovo");
                    break;
            }
        }
    }
}