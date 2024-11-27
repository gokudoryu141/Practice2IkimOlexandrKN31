package practice.task2;

import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Library library = Library.getInstance("Alexandrian's Library");
        Book book1 = new Book("Skibidi Fanum Tax", (short)2024, "Ice Spice");
        Book book2 = new Book("Berserk", (short)1999, "Kentato Miura");
        Book book3 = new Book("The Shining", (short)1977, "Stephen King");
        Book book4 = new Book("All Quiet on the Western Front", (short)1928, "E.M. Remark");
        Book book5 = new Book("Bible 2: Jesus is not crucying around", (short)228, "Chuck Norris");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println("Gallery: " + library.getName());
        Iterator var4 = library.getBooks().iterator();

        Book book;
        while (var4.hasNext()) {
            book = (Book)var4.next();
            System.out.println(library.describeBooks(book));
        }

        library.removeBook(book1);
        System.out.println("\nAfter removal:");
        var4 = library.getBooks().iterator();

        while(var4.hasNext()) {
            book = (Book) var4.next();
            System.out.println(library.describeBooks(book));
        }

    }
}
