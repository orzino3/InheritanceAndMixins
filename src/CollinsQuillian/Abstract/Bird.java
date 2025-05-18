package CollinsQuillian.Abstract;

public abstract class Bird extends Animal {
    @Override
    public boolean hasProperty(String property) {
        switch (property.toLowerCase()) {
            case "can fly": return true;
            case "has wings": return true;
            default: return false;
        }
    }

    @Override
    public boolean isA(String category) {
        return category.equalsIgnoreCase("bird") || super.isA(category);
    }
}
