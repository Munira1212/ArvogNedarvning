package AnimalsActingSpecifically;

public class Cat extends Animal {

    public Cat( String navn){
        super(navn);

    }
    public String makeSound(){

        return " MEOOW";
    }
    public String Scratch(){

        return "SCARTCH";
    }

    @Override
    public String toString() {
        return
                super.toString() +  Scratch();

    }
}
