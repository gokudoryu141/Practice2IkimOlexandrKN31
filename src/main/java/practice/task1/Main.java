package practice.task1;

import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Gallery gallery = Gallery.getInstance("My Art Gallery");
        Picture picture1 = new Picture("Mona Lisa", (short)1503, "Leonardo da Vinci");
        Picture picture2 = new Picture("Starry Night", (short)1889, "Vincent van Gogh");
        gallery.addPicture(picture1);
        gallery.addPicture(picture2);
        System.out.println("Gallery: " + gallery.getName());
        Iterator var4 = gallery.getPictures().iterator();

        Picture picture;
        while(var4.hasNext()) {
            picture = (Picture)var4.next();
            System.out.println(gallery.describePicture(picture));
        }

        gallery.removePicture(picture1);
        System.out.println("\nAfter removal:");
        var4 = gallery.getPictures().iterator();

        while(var4.hasNext()) {
            picture = (Picture)var4.next();
            System.out.println(gallery.describePicture(picture));
        }

    }
}
