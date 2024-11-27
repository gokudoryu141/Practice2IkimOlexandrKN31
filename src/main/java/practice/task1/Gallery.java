package practice.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gallery {
    private List<Picture> pictures;
    private String name;
    private String article;
    private static Gallery instance;

    private Gallery(String name) {
        this.name = name;
        this.pictures = new ArrayList();
    }

    public static Gallery getInstance(String name) {
        if (instance == null) {
            instance = new Gallery(name);
        }

        return instance;
    }

    public boolean addPicture(Picture picture) {
        return this.pictures.add(picture);
    }

    public boolean removePicture(Picture picture) {
        return this.pictures.remove(picture);
    }

    public String describePicture(Picture picture) {
        return this.pictures.contains(picture) ? picture.toString() : "Picture not found in gallery.";
    }

    public Picture getPicture(String name) {
        Iterator var2 = this.pictures.iterator();

        Picture picture;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            picture = (Picture)var2.next();
        } while(!picture.getName().equals(name));

        return picture;
    }

    public List<Picture> getPictures() {
        return new ArrayList(this.pictures);
    }

    public int getPictureCount() {
        return this.pictures.size();
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

    public Gallery get() {
        return null;
    }
}
