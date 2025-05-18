public class Daisy extends Flower{
    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("daisy") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("yellow") || super.hasProperty(property);

    }
}
