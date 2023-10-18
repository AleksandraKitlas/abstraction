package abstraction;

public enum LeafType {
    NEEDLE("Igły"),
    SIMPLE("Liście");

    private final String name;

    LeafType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
