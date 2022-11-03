package RoomsInSchool;

public class KlasseVærelse extends SkoleLokaler {

    private int størrelsePåTavl;
    private String farvePÅVæggen;


    public KlasseVærelse(int rumNummer, int antalPerson, int størrelsePåTavl, String farvePÅVæggen){
        super(rumNummer, antalPerson);
        this.størrelsePåTavl=størrelsePåTavl;
        this.farvePÅVæggen=farvePÅVæggen;

    }

    @Override
    public String toString() {
        return "" + super.getAntalPerson() + " " + super.getRumNummer()+
                "KlasseVærelse{" +
                "størrelsePåTavl=" + størrelsePåTavl +
                ", farvePÅVæggen='" + farvePÅVæggen + '\'' +'\''+
                '}';
    }
}

