package CollinsQuillian.Abstract;

public abstract class Living {
    public boolean isA(String classification) {
        return classification.equalsIgnoreCase("living");

    }

    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("can grow") || property.equalsIgnoreCase("alive");

    }
}
