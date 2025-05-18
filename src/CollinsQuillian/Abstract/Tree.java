package CollinsQuillian.Abstract;

public abstract class Tree extends Plant{
    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("CollinsQuillian.Abstract.Tree") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("big") || property.equalsIgnoreCase("Has branches")  || property.equalsIgnoreCase("Has bark")  || super.hasProperty(property);

    }
}
