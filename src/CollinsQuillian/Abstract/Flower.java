package CollinsQuillian.Abstract;

public abstract class Flower extends Plant{

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("CollinsQuillian.Abstract.Flower") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("Has leaves") || property.equalsIgnoreCase("Has petals")
                || property.equalsIgnoreCase("beautiful")  || super.hasProperty(property);

    }
}
