package LoanItems2;

import java.util.Scanner;

public class LoanITems {

    private int ID;
    private String type;
    private String titel;
    private int runder;
    private static int Counting;

    Scanner sc = new Scanner(System.in);
    Scanner in = new Scanner(System.in);


    public LoanITems(int ID, String type, String titel) {
        this.ID = ID;
        this.type = type;
        this.titel = titel;
    }

    public LoanITems() {

    }

    public void setType(String type) {
       this.type = in.nextLine();

    }
    public String getType() {

        return type;
    }

    public int Antalgange() {
        System.out.println("How many loan items? do you want to register?");
        runder = sc.nextInt();
        return runder;
    }

    public String Type() {
        System.out.println("Type (B eller V)");
        type = in.nextLine();
        if (type.equals("b"))
            type ="Book";
        else   {
            type="Video";
        }
        return type;
    }

    public int ID() {
        System.out.println(" Items no:" + Counting++);
        return Counting;
    }


    public String Titel() {
        System.out.println("Title: ");
        titel = in.nextLine();

        return titel;
    }

    public int Runder() {
        for (int i = 0; i < runder; i++) {

        }
       return runder;
    }

    @Override
    public String toString() {

            return
                    "\n" +  ID + "   " + type + "   " + titel ;

    }

}
