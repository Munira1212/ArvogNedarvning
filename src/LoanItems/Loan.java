package LoanItems;

public class Loan {
    private int userLån;
    private String typeB_A;

//konstrucket
    public Loan(int userLån){
    this.userLån = userLån;
    }

    public Loan(String typeB_A){
        this.typeB_A =typeB_A;
    }

    //metoder

    public int userLån() {
        return userLån;
    }

    public String typeB_A() {
        return typeB_A;
    }




}
