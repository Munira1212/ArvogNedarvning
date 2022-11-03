package AnimalsActingSpecifically;

public class Dog extends Animal{

    public Dog( String navn){
        super(navn);

    }
    public String makeSound(){

        return " WOOOF";
    }


    public String Beg(){

        return "begging";
    }

    @Override
    public String toString() {
        return  super.toString() + Beg();
    }
}
