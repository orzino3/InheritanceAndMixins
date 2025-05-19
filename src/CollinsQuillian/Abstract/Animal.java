package CollinsQuillian.Abstract;

public abstract class Animal extends Living{

    @Override
    public boolean isA(String classification){
        return super.isA(classification) || classification.equalsIgnoreCase("Animal");

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("Can Move") || property.equalsIgnoreCase("Has Skin") || super.hasProperty(property);

    }
}
