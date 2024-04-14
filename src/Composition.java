import java.util.ArrayList;
import java.util.List;

/**
 * Composition class
 */
public class Composition implements GraphicElementPrototype {
    /**
     * List of graphic elements
     */
    public List<GraphicElementPrototype> elements = new ArrayList<>();

    /**
     * Constructor
     */
    public Composition() {

    }

    /**
     * Constructor
     *
     * @param elements List of graphic elements
     */
    public Composition(List<GraphicElementPrototype> elements) {
        this.elements = elements;
    }

    /**
     * Add element
     *
     * @param element Element
     */
    public void addElement(GraphicElementPrototype element) {
        elements.add(element);
    }

    /**
     * Remove element
     *
     * @param element Element
     */
    public void removeElement(GraphicElementPrototype element) {
        elements.remove(element);
    }

    /**
     * Clone
     *
     * @param depth Depth (number of times to clone, negative for infinite)
     * @return GraphicElementPrototype
     */
    @Override
    public GraphicElementPrototype clone(Integer depth) {
        List<GraphicElementPrototype> elements = new ArrayList<>();
        if (depth != 0) {
            for (GraphicElementPrototype element : this.elements) {
                elements.add(element.clone(depth - 1));
            }
        }
        return new Composition(elements);
    }
}
