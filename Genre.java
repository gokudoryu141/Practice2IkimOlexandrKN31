package practice.task22;

import java.util.ArrayList;

public class Genre {
    private String name;
    private String description;
    private int pages;
    private ArrayList<String> legibility;
    private boolean hardcover;
    private boolean quality;
    private GenreStatus status;

    public Genre(String name, String description, int pages,
                 ArrayList<String> legibility, boolean hardcover, boolean quality, GenreStatus status) {
        this.name = name;
        this.description = description;
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
    public void setBookDescription(String description) {
        this.description = description;
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

    public void setHardcover(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasTranslated(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public GenreStatus getStatus() {
        return status;
    }

    public void setStatus(GenreStatus status) {
        this.status = status;
    }
}
