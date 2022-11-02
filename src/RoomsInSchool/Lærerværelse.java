package RoomsInSchool;

public class Lærerværelse extends SkoleLokaler  {

    private String typeAfSpilleKonsol;
    private String typeAfVarmtDriksAutomat;

    public Lærerværelse(int rumNummer, int antalPerson, String typeAfSpilleKonsol, String typeAfVarmtDriksAutomat) {
        super(rumNummer, antalPerson);
        this.typeAfSpilleKonsol = typeAfSpilleKonsol;
        this.typeAfVarmtDriksAutomat = typeAfVarmtDriksAutomat;
    }


    public String getTypeAfSpilleKonsol(){
        return typeAfSpilleKonsol;
    }

    public void setTypeAfSpilleKonsol(String typeAfSpilleKonsol){
         this.typeAfSpilleKonsol= typeAfSpilleKonsol;
    }
    public String gettypeAfVarmtDriksAutomat(){
        return typeAfVarmtDriksAutomat;
    }

    public void setTypeAfVarmtDriksAutomat(String typeAfVarmtDriksAutomat) {
        this.typeAfVarmtDriksAutomat = typeAfVarmtDriksAutomat;
    }



    @Override
    public String toString() {
        return super.getAntalPerson() + " " + super.getRumNummer()+
                "Lærerværelse{" +
                "typeAfSpilleKonsol='" + typeAfSpilleKonsol + '\'' +
                ", typeAfVarmtDriksAutomat='" + typeAfVarmtDriksAutomat + '\'' +
                '}';
    }

}


