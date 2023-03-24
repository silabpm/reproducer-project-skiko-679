import org.jetbrains.skia.Image

class ImageLoader {

    public fun getImageFromResources(fileName: String): Image {
        this::class.java.getResourceAsStream(fileName).use{inputStream ->
            return Image.makeFromEncoded(inputStream.readAllBytes())
        }
    }
}