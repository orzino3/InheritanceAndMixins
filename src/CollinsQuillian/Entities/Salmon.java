package CollinsQuillian.Entities;

import CollinsQuillian.Abstract.Fish;

public class Salmon extends Fish {

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("salmon") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("red") || super.hasProperty(property);

    }
}
