package CollinsQuillian.Entities;

import CollinsQuillian.Abstract.Bird;

public class Robin extends Bird
{
    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("robin") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("red") || super.hasProperty(property);

    }
}
