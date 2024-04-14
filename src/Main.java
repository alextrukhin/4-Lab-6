import java.util.ArrayList;

/*
 * Main class
 */
public class Main {
    /**
     * Main method
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        Composition composition1 = new Composition(new ArrayList<>());
        Composition composition2 = new Composition(new ArrayList<>());
        Primitive figure1 = new Primitive(1, 2, 3, 4, "red");
        Primitive figure2 = new Primitive(0, 0, 1, 1, "blue");
        Primitive figure3 = new Primitive(0, 0, 1, 1, "green");
        composition1.addElement(figure1);
        composition1.addElement(figure2);
        composition1.addElement(figure3);
        composition1.removeElement(figure3);
        composition2.addElement(figure1);
        composition1.addElement(composition2);

        Composition clonedComposition1 = (Composition) composition1.clone(0);
        Composition clonedComposition2 = (Composition) composition1.clone(1);
        Composition clonedComposition3 = (Composition) composition1.clone(-1);

        System.out.println("Finish");
    }
}