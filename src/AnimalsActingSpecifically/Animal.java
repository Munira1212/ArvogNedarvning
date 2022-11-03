package AnimalsActingSpecifically;

public abstract class Animal {

    private String navn;
    private String makeSound;

    public Animal( String navn){
        this.navn=navn;


    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(String navn){
        this.navn=navn;
    }

    public String makeSound(){

       return " Animal sounds;";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "navn='" + navn + '\'' +
                makeSound() + '\'' + " " +
                '\'' ;
    }
}
