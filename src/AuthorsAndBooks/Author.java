package AuthorsAndBooks;

import java.util.ArrayList;

public class Author {
    private String name;
    private String email;
    private char gender;
   // private Book[] books;

    ArrayList <Book> books = new ArrayList<>();
    public Author(String name, char gender, String email){
        this.books= books;
        this.name= name;
        this.gender=gender;
        this.email=email;
    }
    public Author(){

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


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

  /* public Book addBook(Book book) {

        books.add(0,book);
      return bo
    }*/




}
