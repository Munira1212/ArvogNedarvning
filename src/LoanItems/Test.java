package LoanItems;

public class Test {

    public static void main(String[] args) {

      //  System.out.println("how many items?");
        UserItemLoan ui= new UserItemLoan();
        int usersLån = ui.AntalLån("How manu items?");

        ItemsLoan il = new ItemsLoan(usersLån);
        int output = il.userLån();

        ui.myPrint(output);

    }
}
