package practice.task1;

public class Picture {
    private String name;
    private short year;
    private String author;

    public Picture(String name, short year, String author) {
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

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Picture {name='%s', year=%d, author='%s'}", name, year, author);
    }

}
