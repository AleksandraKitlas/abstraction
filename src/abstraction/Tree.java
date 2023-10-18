package abstraction;

public abstract class Tree {
    private final double trunkHeight;
    private final int branches;
    private final LeafType leafType;

    public Tree(double trunkHeight, int branches, LeafType leafType) {
        this.trunkHeight = trunkHeight;
        this.branches = branches;
        this.leafType = leafType;
    }

    public abstract void grow();

    public double getTrunkHeight() {
        return trunkHeight;
    }

    public int getBranches() {
        return branches;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    @Override
    public String toString() {
        return "Wysokość pnia: " + trunkHeight + " metrów\n" +
                "Ilość gałęzi: " + branches + "\n" +
                "Rodzaj liści: " + leafType.getName();
    }
}