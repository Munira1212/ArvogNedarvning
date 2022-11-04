package AnimalsActingSpecifically;

import java.util.ArrayList;

public class AnimalsActingSpecifically {

    void run() {

      ArrayList<Animal> animals = new ArrayList<>();

      Dog dog = new Dog(" Fiddo");
        Dog dogOne = new Dog(" Middo");
      Cat cat = new Cat("cattie");
        Cat catTwo = new Cat("Mattie");

      animals.add(dog);
      animals.add(dogOne);
      animals.add(cat);
      animals.add(catTwo);

        for (int i = 0; i < animals.size(); i++){
            Animal a = animals.get(i);
          System.out.println(a);
//kan også gøre animals.get(i) & sæt den som et a
          if (a instanceof Dog)
            ((Dog) animals.get(i)).Beg();

          else if ( animals.get(i) instanceof Cat)
            ((Cat) animals.get(i)).Scratch();

        }


  }

    public  static void main(String[]args) {
         new AnimalsActingSpecifically().run();

    }
}
