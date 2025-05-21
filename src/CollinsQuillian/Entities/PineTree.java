package CollinsQuillian.Entities;

import CollinsQuillian.Abstract.Tree;

public class PineTree extends Tree {

    @Override
    public boolean isA(String classification){
        return classification.equalsIgnoreCase("Pine tree") || super.isA(classification);

    }

    @Override
    public boolean hasProperty(String property){
        return property.equalsIgnoreCase("green") || super.hasProperty(property);

    }
}
