import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Korttipakka {
    private ArrayList<Pelikortti> kortit;
    private Scanner lukija;
    
    public Korttipakka() {
        kortit = new ArrayList<Pelikortti>();
        for (int i = 1; i <= 13; i++) {
            kortit.add(new Pelikortti(i, "pata"));
            kortit.add(new Pelikortti(i, "risti"));
            kortit.add(new Pelikortti(i, "ruutu"));
            kortit.add(new Pelikortti(i, "hertta"));
        }
    }
    
    public void sekoita() {
        Collections.shuffle(kortit);
    }
    
    public Pelikortti nosta() {
        if (kortit.size() == 0) {
            return null;
        }
        return kortit.remove(0);
    }
    
    public void palauta() {
        kortit.clear();
        for (int i = 1; i <= 13; i++) {
            kortit.add(new Pelikortti(i, "pata"));
            kortit.add(new Pelikortti(i, "risti"));
            kortit.add(new Pelikortti(i, "ruutu"));
            kortit.add(new Pelikortti(i, "hertta"));
        }
    }
    
    public String toString() {
        return kortit.toString();
   }


//    Change so it asks user for nosta, palauta or lopeta
   public static void main (String[] args) {
     Korttipakka pakka = new Korttipakka();
     lukija = new Scanner(System.in);
     pakka.sekoita();
    //  System.out.println(pakka);
     System.out.println(pakka.nosta());
    //  System.out.println(pakka);
     pakka.palauta();
     System.out.println(pakka);
   }

}
