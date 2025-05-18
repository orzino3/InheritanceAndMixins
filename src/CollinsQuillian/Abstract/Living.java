package CollinsQuillian.Abstract;

public abstract class Living {
    public boolean isA(String classification) {
        return classification.equalsIgnoreCase("living");

    }

    public abstract boolean hasProperty(String property);
}
