package practice.task21;

public class USAPictureBuilder implements PictureBuilder {
    private Picture picture;
    Size size1 = new Size(0, 0);



    public USAPictureBuilder() {
        this.picture = new Picture(null, (short) 0, null, null, null, null, size1, false, null);
    }


    @Override
    public void setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.author = author; // Прямий доступ, оскільки поля не мають сеттерів
    }


    public void setSizeParams(Size size) {
        picture.size = size;
    }

    public void setColorParams(String[] colors, boolean withFrames, String canvas) {
        picture.colors = colors;
        picture.isWithFrames = withFrames;
        picture.canvas = canvas;
    }


    public void setCategoryParams(String theme, String category) {
        picture.theme = theme;
    }
    public Picture build() {
        return picture;
    }
}
