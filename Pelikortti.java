public class Pelikortti {
    private int arvo;
    private String maa;
    
    public Pelikortti(int arvo, String maa) {
        this.arvo = arvo;
        this.maa = maa;
    }
    
    public int getArvo() {
        return arvo;
    }
    
    public String getMaa() {
        return maa;
    }
    
    public String toString() {
        return maa + " " + arvo;
    }

}
