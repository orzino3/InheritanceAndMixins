package CollinsQuillian.Abstract;

public abstract class Bird extends Animal {
    @Override
    public boolean hasProperty(String property) {

        return property.equalsIgnoreCase("can fly")  ||
                property.equalsIgnoreCase("has wings")  ||
                super.hasProperty(property);
    }

    @Override
    public boolean isA(String category) {
        return category.equalsIgnoreCase("bird") || super.isA(category);
    }
}
