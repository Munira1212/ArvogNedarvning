package AuthorsAndBooks;

import java.util.ArrayList;

public class Book extends Author {
    private String titel;
    private int numPages;
    private Author author;


   public Book(Author author, String titel, int numPages) {

       this.author = author;
       this.titel = titel;
       this.numPages = numPages;
        }
       public Author getAuthor() {

           return author;
       }

       public String getTitel() {
           return titel;
       }

       public int getNumPages() {
           return numPages;
       }

       @Override
     public String toString() {
        return super.toString();
        }
}
