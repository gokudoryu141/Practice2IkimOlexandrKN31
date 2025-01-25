package practice.task22;

import java.util.ArrayList;

public class ThrillerBuilder extends GenreBuilder {

    public ThrillerBuilder(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void setBasicParams(String bookName, String bookAuthor, int bookPages) {
        genre.setBookName(bookName);
        genre.setBookDescription(bookAuthor);
        genre.setBookPages(bookPages);
    }

    @Override
    public void setStatusParams(GenreStatus status) {
        genre.setStatus(status);
    }

    @Override
    public void setLegibilityParams(ArrayList<String> legibility, boolean hardcover, boolean translated) {
        genre.setLegibility(legibility);
        genre.setHardcover(hardcover);
        genre.setHasTranslated(translated);
    }

    @Override
    public void setDescription(String description) {
        genre.setDescription(description);
    }

    @Override
    public Genre build() {
        System.out.println("You have created a Thriller instance for public transport!");
        return genre;
    }
}