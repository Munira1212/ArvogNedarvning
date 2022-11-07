package LoanItems2;

import java.util.Scanner;

public class Video extends LoanITems{
    private LoanITems video;


    Scanner sc= new Scanner(System.in);

    public Video(int ID, String type, String titel){
        super(ID, type,titel);
        this.video=video;
    }



    public String Type() {
        if (getType().equals("v")){

        }

        return "Video";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
