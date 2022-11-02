package RoomsInSchool;

public class SkoleLokaler {
    private int rumNummer;
    private int antalPerson;

    public SkoleLokaler(int rumNummer, int antalPerson) {
        this.rumNummer = rumNummer;
        this.antalPerson = antalPerson;
    }

    public SkoleLokaler(){
       System.out.println(" Der er forskellige lokaler i skolen");
    }
    public void setRumNummer(int rumNummer){
     this.rumNummer=rumNummer;
    }
    public int getRumNummer(){
       return rumNummer;
    }

    public void setAntalPerson(int antalPerson){
       this.antalPerson=antalPerson;
    }

    public int  getAntalPerson(){
       return antalPerson;
    }
}
