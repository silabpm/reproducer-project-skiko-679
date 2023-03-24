import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OneBitPerPixelTest {

    companion object {
        private const val IMG_1BBP ="checkerboard.bmp"
    }
    @Test
    fun oneBitPerPixelTest(){
        val image = ImageLoader().getImageFromResources(IMG_1BBP)
        assertEquals(296, image.width)
    }
}