package practice.task21;

import java.util.Scanner;

public interface PictureBuilder {

    void setBasicParams(String name, short year, String author);

    void setSizeParams(Size size);

    void setColorParams(String[] colors, boolean isWithFrames, String canvas);
    void setCategoryParams(String theme, String category);


    Picture build();
}

