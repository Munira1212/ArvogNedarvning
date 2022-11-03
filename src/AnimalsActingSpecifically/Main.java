package AnimalsActingSpecifically;

import java.util.ArrayList;

public class Main {

    public  static void main(String[]args){

        ArrayList<Dog> animals = new ArrayList<>();

        Dog dog= new Dog( "wooof");
        Cat cat= new Cat("meooow");
        animals.add(dog);
        dog.setNavn("DOOG");

        System.out.println(  animals.get(0) + dog.makeSound() + dog.getNavn() );
        System.out.println(dog);
// System.out.println(animals.get(0));

    }



}
