package AuthorsAndBooks;

public class Test {
    public static void main(String[] args) {
        Author author1 = new Author("H. C.Andersen",'M',"hc@ndersen.dk");
        System.out.println("AUTHORS AND BOOKS:");

        //ArrayList<Book> test = new ArrayList<>();


        Book bookk = new Book(author1,"klodhans",48);
        Book book1 = new Book(author1, "fyrtæjet",55);
        //author1.addBook(0,book);


       author1.books.add(0,bookk);
       author1.books.add(1,book1);

        System.out.println(author1.books.get(0).getAuthor());
        System.out.println(author1.books.get(0).getTitel() +" " + author1.books.get(0).getNumPages());
        System.out.println(author1.books.get(1).getTitel() + " " + author1.books.get(1).getNumPages());


        System.out.println("""
                """);


    }
}
