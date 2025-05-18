public class Canary extends Bird {

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("canary") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("yellow") || property.equalsIgnoreCase("can sing") || super.hasProperty(property);

    }
}
