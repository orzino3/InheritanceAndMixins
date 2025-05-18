public class OakTree extends Tree{

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("Oak tree") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("has leaves") || super.hasProperty(property);

    }
}
