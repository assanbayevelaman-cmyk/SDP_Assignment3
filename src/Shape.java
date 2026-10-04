public abstract class Shape {
    private final String id;
    private Renderer renderer;
    protected Shape(String id, Renderer renderer) {
        this.id = id;
        this.renderer = renderer;
    }
    public String getId() {
        return id;
    }
    public void setImplementation(Renderer renderer) {
        this.renderer = renderer;
    }
    public String execute() {
        return renderer.render(shapeName(), dimName(), dimValue());
    }
    protected abstract String shapeName();
    protected abstract String dimName();
    protected abstract int dimValue();
}
