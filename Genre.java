package practice.task22;

import java.util.ArrayList;

public class Genre {
    private String name;
    private String author;
    private int pages;
    private ArrayList<String> legibility;
    private boolean hardcover;
    private boolean quality;
    private GenreStatus status;

    public Genre(String name, String author, int pages,
                 ArrayList<String> legibility, boolean hardcover, boolean quality, GenreStatus status) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.legibility = legibility;
        this.hardcover = hardcover;
        this.quality = quality;
        this.status = status;
    }

    public Genre() {}

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getLegibility() {
        return legibility;
    }

    public void setLegibility(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    public boolean hardcover() {
        return hardcover;
    }

    public void hardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    public void setTranslated(boolean translated) {
        this.translated = translated;
    }

    public GenreStatus getStatus() {
        return status;
    }

    public void setStatus(GenreStatus status) {
        this.status = status;
    }
}
