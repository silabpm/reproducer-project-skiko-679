package skiko.image.util;

import org.jetbrains.skia.Image;

import java.io.IOException;
import java.io.InputStream;

public class ImageLoaderJava {
    public Image getImageFromResources(String fileName) throws IOException {
        try(InputStream inputStream = ImageLoaderJava.class.getResourceAsStream(fileName)){

            return Image.Companion.makeFromEncoded(inputStream.readAllBytes());
        }
    }
}
