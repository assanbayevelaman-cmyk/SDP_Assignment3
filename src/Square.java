public class Square extends Shape {
    private final int side;
    public Square(String id, Renderer r, int side) {
        super(id, r);
        this.side = side;
    }
    protected String shapeName() {
        return "square";
    }
    protected String dimName() {
        return "side";
    }
    protected int dimValue() {
        return side;
    }
}
