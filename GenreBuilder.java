package practice.task22;

import java.util.ArrayList;

public abstract class GenreBuilder {
    protected Genre genre;

    public abstract void setBasicParams(String bookName, String bookAuthor, int bookPages);
    public abstract void setStatusParams(GenreStatus status);
    public abstract void setLegibilityParams(ArrayList<String> legibility, boolean hardcover, boolean translated);
    public abstract void setDescription(String description);
    public abstract Genre build();
}