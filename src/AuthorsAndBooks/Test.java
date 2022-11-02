package AuthorsAndBooks;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Author author= new Author("HC Andersen",'k', "mmm@" );
        author.setEmail("HCCCCp@e");
        Book book = new Book(author, "Hans", 99);
        System.out.println(book);


    }
}
