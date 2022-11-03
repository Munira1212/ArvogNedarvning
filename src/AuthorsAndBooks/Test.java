package AuthorsAndBooks;

public class Test {
    public static void main(String[] args) {

        Author author1 = new Author("H. C.Andersen",'M',"hc@ndersen.dk");
        Author author2 = new Author(" JK Rowling" ,'f', "jk@owling.co.uk ");
        Author author3 = new Author("Søren Kirkegård",'M',"  kirkeg@rd.dk");

        Book book1 = new Book(author1,"klodhans",48);
        Book book2 = new Book(author1, "fyrtæjet",55);
        Book book3 = new Book(author2, "Harry Potter - Part 1 ", 437);
        Book book4 = new Book(author2, "Harry Potter - Part 2", 652);
        Book book5 = new Book(author2,"Harry Potter - Part 3", 318);
        Book book6 = new Book(author2,"Harry Potter - Part 4", 445);
        Book Bookseven = new Book(author3,"Filosofiens grundviden ", 91);
        Book Bookeigth = new Book(author3,"Filopsofi for viderkomne", 713);
        Book Booknine = new Book(author3,"Avanceret akademisk filosofi ", 599);

        author1.books.add(0,book1);
        author1.books.add(1,book2);

        author2.books.add(0, book3);
        author2.books.add(1, book4);
        author2.books.add(2,book5);
        author2.books.add(3, book6);


        author3.books.add(0, Bookseven);
        author3.books.add(1, Bookeigth);
        author3.books.add(2, Booknine);




        //udprint af Hc.Andersen
      System.out.println(author1.books.get(0).getAuthor() + " "+  '\n'
               + author1.books.get(0).getTitel() + "" + author1.books.get(0).getNumPages() + '\n'
                + author1.books.get(1).getTitel() + " " + author1.books.get(1).getNumPages());


        //Udprintet af J.K.Rowling og hendes bøger.
        System.out.println(author2.books.get(0).getAuthor() + " "+  '\n'
                + author2.books.get(0).getTitel() + "" + author2.books.get(0).getNumPages()  + '\n'
                + author2.books.get(1).getTitel() + " " + author2.books.get(1).getNumPages() + '\n'
                + author2.books.get(2).getTitel() + " " + author2.books.get(2).getNumPages()  + '\n'
                + author2.books.get(3).getTitel() + " " + author2.books.get(3).getNumPages());



        //Udprintet af Søren Kiregård og hans bøger.
        System.out.println( author3.books.get(0).getAuthor() + " "+  '\n'
                        + author3.books.get(0).getTitel() + "" + author3.books.get(0).getNumPages()  + '\n'
                        + author3.books.get(1).getTitel() + " " + author3.books.get(1).getNumPages() + '\n'
                        + author3.books.get(2).getTitel() + " " + author3.books.get(2).getNumPages());


        System.out.println("""
                """);


    }
}
