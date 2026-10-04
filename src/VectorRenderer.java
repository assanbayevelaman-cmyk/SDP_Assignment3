public class VectorRenderer implements Renderer {
    public String render(String shape, String dim, int value) {
        return "VECTOR " + shape + " " + dim + "=" + value;
    }
}
