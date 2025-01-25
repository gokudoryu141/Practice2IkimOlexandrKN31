package practice.task21;

public class UkrainePictureBuilder implements PictureBuilder {

    private Picture picture;
    Size size1 = new Size(0, 0);



    public UkrainePictureBuilder() {
        this.picture = new Picture(null, (short) 0, null, null, null, null, size1, false, null);
    }

    public void setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.author = author;
    }


    public void setSizeParams(Size size) {
        picture.size = size;

    }


    public void setColorParams(String[] colors, boolean withFrames, String canvas) {

    }

    public void setCategoryParams(String theme, String category) {

    }


    public Picture build() {
        return picture;
        
    }


}
