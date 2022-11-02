package RoomsInSchool;

public class KlasseVærelse extends SkoleLokaler {

    private int størrelsePåTavl;
    private String farvePÅVæggen;


    public KlasseVærelse(int rumNummer, int antalPerson, int størrelsePåTavl, String farvePÅVæggen){
        super(rumNummer, antalPerson);
        this.størrelsePåTavl=størrelsePåTavl;
        this.farvePÅVæggen=farvePÅVæggen;

    }

   /* public void setStørrelsePåTavl(int størrelsePåTavl){
        this.størrelsePåTavl=størrelsePåTavl;
    }
    public int getStørrelsePåTavl(){
        return størrelsePåTavl;
    }
    public void setFarvePÅVæggen(String farvePÅVæggen){
        this.farvePÅVæggen=farvePÅVæggen;
    }
    public String getFarvePÅVæggen(){
       return farvePÅVæggen;
    }
   */

    @Override
    public String toString() {
        return "" + super.getAntalPerson() + " " + super.getRumNummer()+
                "KlasseVærelse{" +
                "størrelsePåTavl=" + størrelsePåTavl +
                ", farvePÅVæggen='" + farvePÅVæggen + '\'' +'\''+
                '}';
    }
}

