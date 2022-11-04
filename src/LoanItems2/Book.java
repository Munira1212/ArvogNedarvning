package LoanItems2;

import LoanItems.Loan;

import java.util.Scanner;

public class Book extends LoanITems {
    private LoanITems book;
    Scanner sc= new Scanner(System.in);

    public Book(int ID, String type, String titel){
        super(ID, type,titel);

    }
    public Book(){


    }


    public String Type() {
        System.out.println("Type B eller V");

        if (getType().equals("b")){

        }

        return "Book";
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
