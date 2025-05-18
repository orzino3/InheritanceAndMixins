public class Salmon extends Fish{


    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("Is Red") || super.hasProperty(property);

    }
}
