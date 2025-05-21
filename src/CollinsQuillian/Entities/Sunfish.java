package CollinsQuillian.Entities;

import CollinsQuillian.Abstract.Fish;

public class Sunfish extends Fish {

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("sunfish") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("yellow") || super.hasProperty(property);

    }
}
