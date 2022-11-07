package LoanItems;

import java.util.Scanner;

public class UserItemLoan {

Scanner sc= new Scanner(System.in);




   public int AntalLån(){
      return sc.nextInt();
   }

   public int AntalLån(String text){

       return AntalLån();
   }
    public int readint(int output) {
        int number = sc.nextInt();
        sc.nextLine(); // Scanner bug
        return number;
    }


}
