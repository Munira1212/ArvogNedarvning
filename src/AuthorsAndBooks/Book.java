package AuthorsAndBooks;

public class Book extends Author {
    private String titel;
    private int numPages;
    private Author author;

   // public Book(Author author, String titel, int numPages){
        //super(author.addBooks(book));
    // super(author.getName(), author.getGender(), author.getEmail());
    // this.author=author;
     //this.titel=titel;
     //this.numPages =numPages;

    //}*


    /*public Book(String name, char gender, String email, Book[] books, String titel, int numPages ){
        super(name, gender, email, books);
        this.titel=titel;
        this.numPages =numPages;

    }*/

    /*public Book(String[] strings, String name, int navn) {
        super(numPages , titel);
    }*/

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
        return author.getName() + author.getEmail() + author.getGender() +
                "titel='" + titel + '\'' +
                ", numPages=" + numPages ;

    }
}
