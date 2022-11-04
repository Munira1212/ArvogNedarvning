package LoanItems;

import java.util.Scanner;

public class ItemLoan {

    private String book;
    private String video;
    private static int Counting=1;

    Scanner sc= new Scanner(System.in);


    public void setBook(String book){
        this.book=sc.nextLine();
    }

    public String getBook(){
        return book;
    }

    public void setVideo(String video){
        this.video=sc.nextLine();
    }

    public String getVideo(){
        return video;
    }

    public String BookList(){
        System.out.println(" Items no:" + Counting++ + "\n" + "Titel");
        setBook(book);

        return book;
    }

    public String VideoList(){
        System.out.println(" Items no:" + Counting++ );
        System.out.println("Titel;" + getVideo());
        return video;
    }



}
