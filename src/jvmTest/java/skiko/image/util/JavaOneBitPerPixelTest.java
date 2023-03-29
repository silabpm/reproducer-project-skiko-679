package skiko.image.util;

import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class JavaOneBitPerPixelTest {
    private static final String IMG_1BBP ="/checkerboard.bmp";

    @Test
    void oneBitPerPixelTest() throws IOException {
        var image = new ImageLoaderJava().getImageFromResources(IMG_1BBP);
        assertEquals(296, image.getWidth());
    }
}
