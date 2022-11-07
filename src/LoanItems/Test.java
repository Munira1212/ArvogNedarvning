package LoanItems;

import java.util.ArrayList;

public class Test {

    void run() {
        ArrayList<String> arrayItems = new ArrayList<>();

        UserItemLoan uiInt = new UserItemLoan();
        UserItemLoan uistring = new UserItemLoan();
        ItemLoan typer = new ItemLoan();


        int anttalLån = uiInt.IntText("How manu items?");
        Loan il = new Loan(anttalLån);
        int output = il.userLån();


        String typeB_A = uistring.stringText("Hvilke type b for bog  & v for Video ");



        Loan iLbook = new Loan(typeB_A);
        String typeOut = iLbook.typeB_A();

       //String Videoout = typer.VideoList();

        uiInt.readint(output);
        uistring.myPrint(typeOut);

        if (uistring.stringText().equals("b")){
            String bookout = typer.BookList();

            // arrayItems.add(bookout);

        } else {

          //  uistring.myPrint(typer.VideoList());
        }
        uiInt.readint(output);
        uistring.myPrint(typeOut);
        arrayItems.add(typer.BookList());


    }

        public static void main(String[] args) {
       new Test().run();
    }
}
