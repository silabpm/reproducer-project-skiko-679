package skiko.image.util;

import java.io.IOException;

public class Main {
    private static final String IMG_1BBP ="/checkerboard.bmp";
    public void main() throws IOException {
        var image = new ImageLoaderJava().getImageFromResources(IMG_1BBP);
        System.out.println(image.getWidth());
    }
}
