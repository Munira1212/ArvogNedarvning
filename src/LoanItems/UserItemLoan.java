package LoanItems;

import java.util.Scanner;

public class UserItemLoan {

Scanner sc= new Scanner(System.in);


    public void myPrint(String text){
         System.out.println(text);
    }

   public int AntalLån(){
      return sc.nextInt();
   }

   public int AntalLån(String text){
      myPrint(text);
       return AntalLån();
   }



}
