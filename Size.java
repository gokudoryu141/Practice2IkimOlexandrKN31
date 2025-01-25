package practice.task21;

public class Size {
    private int height;
    private int width;

    Size(int height, int width){
        this.width = width;
        this.height = height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
