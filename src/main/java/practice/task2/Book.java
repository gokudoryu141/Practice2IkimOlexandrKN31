package practice.task2;

public class Book {
    private String name;
    private short year;
    private String author;

    public Book(String name, short year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("Book{name='%s', year=%d, author='%s'}", name, year, author);
    }
}
