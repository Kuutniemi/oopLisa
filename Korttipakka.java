import java.util.ArrayList;
import java.util.Collections;

public class Korttipakka {
    private ArrayList<Pelikortti> kortit;
    
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


   public static void main (String[] args) {
     Korttipakka pakka = new Korttipakka();
     pakka.sekoita();
    //  System.out.println(pakka);
     System.out.println("Nostit kortin: " + pakka.nosta());
    //  System.out.println(pakka);
     pakka.palauta();
   }

}
