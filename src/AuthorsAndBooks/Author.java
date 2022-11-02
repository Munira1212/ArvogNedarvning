package AuthorsAndBooks;

import java.util.ArrayList;

public class Author {
    private String name;
    private String email;
    private char gender;
    private Book[] books;

    ArrayList<String> arrybooks = new ArrayList<>();
    public Author(String name, char gender, String email, Book[] book){
        this.books= books;
        this.name= name;
        this.gender=gender;
        this.email=email;
    }
    public Author(Book[] books){
        this.books= books;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public void setEmail(String name){
        this.name=name;
    }

    public void addBooks(Book book) {
        //ArrayList<String> arryboks = new ArrayList<>();

        arrybooks.add(String.valueOf(book));
    }


}
