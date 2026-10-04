public class Circle extends Shape {
    private final int radius;
    public Circle(String id, Renderer r, int radius) {
        super(id, r);
        this.radius = radius;
    }
    protected String shapeName() {
        return "circle";
    }
    protected String dimName() {
        return "radius";
    }
    protected int dimValue() {
        return radius;
    }
}
