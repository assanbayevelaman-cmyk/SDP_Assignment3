public class RasterRenderer implements Renderer {
    public String render(String shape, String dim, int value) {
        return "RASTER pixels " + shape + " "  + dim + "=" + value;
    }
}
