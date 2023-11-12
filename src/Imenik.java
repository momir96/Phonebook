import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Imenik implements Serializable {

    private HashMap<Osoba, Unos> imenik = new HashMap<>();
    private File fajl = new File("C:\\Users\\Korisnik\\OneDrive\\Radna površina\\Imenik.txt");

    public Imenik(){
        if (fajl.exists()){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(fajl));
                imenik = (HashMap<Osoba, Unos>) in.readObject();
                in.close();

            } catch (FileNotFoundException ex){
                ex.printStackTrace();

            } catch (ClassNotFoundException | IOException e) {
               e.printStackTrace();
            }
        }
    }
    public void sacuvaj(){
        try {
            System.out.println("Cuvanje imenika");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fajl));
            out.writeObject(imenik);
            System.out.println("Zavrseno");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void dodajUnos(Unos unos){

        imenik.put(unos.getOsoba(), unos);
    }

    public void izlistajOsobe(){

        LinkedList<Unos> unosi = new LinkedList<>(imenik.values());
        Collections.sort(unosi);
        for (Unos unos : unosi){
            System.out.println(unos);
        }
    }

    public Unos getUnos(Osoba osoba) {

        return imenik.get(osoba);
    }

    public BrojTelefona getBroj(Osoba osoba){

        return getUnos(osoba).getBroj();
    }
}
