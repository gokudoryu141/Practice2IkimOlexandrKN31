package practice.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;
    private String name;
    private String article;
    private static practice.task2.Library instance;

    private Library(String name) {
        this.name = name;
        this.books = new ArrayList();
    }

    public static practice.task2.Library getInstance(String name) {
        if (instance == null) {
            instance = new practice.task2.Library(name);
        }

        return instance;
    }

    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

        public String describeBooks(Book book) {
        return this.books.contains(book) ? book.toString() : "Book not found in gallery.";
    }

    public Book getBook(String name) {
        Iterator var2 = this.books.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            book = (Book) var2.next();
        } while(!book.getName().equals(name));

        return book;
    }

    public List<Book> getBooks() {
        return new ArrayList(this.books);
    }

    public int getBookCount() {
        return this.books.size();
    }

    public String getName() {
        return this.name;
    }

    public String getArticle() {
        return this.article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public practice.task2.Library get() {
        return null;
    }
}