package AuthorsAndBooks;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Author author1 = new Author("H. C.Andersen",'M',"hc@ndersen.dk");
        System.out.println("AUTHORS AND BOOKS:");

        ArrayList<Book> test = new ArrayList<>();

        Book book = new Book(author1,"klodhans",48,test);
        Book book1 = new Book(author1, "fyrtæjet",55, test);
        test.add(0, book);

        test.add(1, book1);
        System.out.println(test.get(0).getAuthor());
        System.out.println(test.get(0).getTitel());
        System.out.println(test.get(0).getNumPages());

        System.out.println(test.get(1).getTitel());
        System.out.println(test.get(1).getNumPages());



        author1.addBook(book);

        System.out.println("""
                """);


    }
}
