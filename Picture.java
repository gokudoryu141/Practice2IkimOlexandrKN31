package practice.task21;

public class Picture {
    private  String  name;
    private short year;
    String author;
    String theme;
    String category;
    String[] colors;
    Size size;
    boolean isWithFrames;
    String canvas;

    public Picture(String name, short year, String author, String theme, String category, String[] colors,
                   Size size, boolean isWithFrames, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.size = size;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(short year){
        this.year = year;
    }


    public short getYear(){
        return year;
    }



    public String writeInformation() {
        return "Картина: " + name + " (" + year + "), Автор: " + author +
                ", Тема: " + theme + ", Кольори: " + String.join(", ", colors) +
                ", Розміри: " + size.getHeight() + "x" + size.getWidth() +
                ", Рами: " + (isWithFrames ? "так" : "ні") + ", Полотно: " + canvas;
    }
}
