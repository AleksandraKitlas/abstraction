package abstraction;

public abstract class Conifer extends Tree {

    private int cones;

    public Conifer(double trunkHeight, int branches, int cones) {
        super(trunkHeight, branches, LeafType.NEEDLE);
        this.cones = cones;
    }

    public void shedCones() {
        if (cones > 5) {
            System.out.println("Z drzewa spadło " + cones + " szyszek!");
            cones = 0;
        }
    }

    public void shedNeedles(){
        System.out.println("Zrzucam igły!");
    }

    public int getCones() {
        return cones;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIlość szyszek: " + cones;
    }
}

