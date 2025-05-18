package CollinsQuillian.Abstract;

public abstract class Fish extends Animal{

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("CollinsQuillian.Abstract.Fish") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("Can Swim") || property.equalsIgnoreCase("Has gills")  || property.equalsIgnoreCase("Has scales")  || super.hasProperty(property);

    }
}
