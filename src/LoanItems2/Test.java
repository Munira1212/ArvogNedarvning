package LoanItems2;

import AnimalsActingSpecifically.Animal;
import AnimalsActingSpecifically.Dog;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<LoanITems> ItemList = new ArrayList<>();

        LoanITems lI = new LoanITems();
        lI.Antalgange();
        for (int i = 0; i < lI.Runder(); i++) {

            ItemList.add(new LoanITems(lI.ID(), lI.Type(), lI.Titel()));

        }
        System.out.println(  "List of LoanItems"  + "\n" +"------------------" + "\n" + "ID   " + "Type   " + "Titel" );

        System.out.println(ItemList.toString().replace("[", " ").replace("]", "").replace(", ", " \n"));


    }

}
