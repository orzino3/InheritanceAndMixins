package CollinsQuillian.Entities;

import CollinsQuillian.Abstract.Flower;

public class Rose extends Flower
{
    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("rose") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("red") || super.hasProperty(property);

    }
}
