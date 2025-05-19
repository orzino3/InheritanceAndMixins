package CollinsQuillian.Abstract;

public abstract class Plant extends Living{

    @Override
    public boolean isA(String classification){
        return super.isA(classification) || classification.equalsIgnoreCase("CollinsQuillian.Abstract.Plant");

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("Has roots") || super.hasProperty(property);

    }
}
