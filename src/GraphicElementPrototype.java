/**
 * Prototype interface for GraphicElementPrototype
 */
public interface GraphicElementPrototype {
    /**
     * Clone
     *
     * @param depth Depth (number of times to clone, negative for infinite)
     * @return GraphicElementPrototype
     */
    public GraphicElementPrototype clone(Integer depth);
}
