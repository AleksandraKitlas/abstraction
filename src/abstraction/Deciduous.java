package abstraction;

public abstract class Deciduous extends Tree{

    private final boolean isFruitTree;
    public Deciduous(double trunkHeight, int branches, boolean isFruitTree) {
        super(trunkHeight, branches, LeafType.SIMPLE);
        this.isFruitTree = isFruitTree;
    }

    public boolean isFruitTree() {
        return isFruitTree;
    }

    @Override
    public String toString() {
        String isFruit = isFruitTree ? "Tak" : "Nie";
        return super.toString() + "\nDrzewo owocowe: " + isFruit;
    }
}
