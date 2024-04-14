/**
 * Primitive class
 * Represents a primitive graphic element
 */
public class Primitive implements GraphicElementPrototype {
    /**
     * X coordinate
     */
    public double x;
    /**
     * Y coordinate
     */
    public double y;
    /**
     * Width
     */
    public double w;
    /**
     * Height
     */
    public double h;
    /**
     * Color
     */
    public String color;

    /**
     * Constructor
     */
    public Primitive() {

    }

    /**
     * Constructor
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param w Width
     * @param h Height
     */
    public Primitive(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    /**
     * Constructor
     *
     * @param x     X coordinate
     * @param y     Y coordinate
     * @param w     Width
     * @param h     Height
     * @param color Color
     */
    public Primitive(double x, double y, double w, double h, String color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    @Override
    public GraphicElementPrototype clone(Integer depth) {
        return new Primitive(this.x, this.y, this.w, this.h, this.color);
    }
}
