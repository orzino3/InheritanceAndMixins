package MixinModel.Constants;

import MixinModel.Entities.*;
import MixinModel.Interfaces.Operable;

import java.util.List;

public class Constants {

    public final static List<Operable> DEVICES_LIST = List.of(
            new ElectricMotor(),
            new Fridge(),
            new MechanicalMotor(),
            new Oven(),
            new Radio(),
            new Speaker(),
            new Television()
    );

    public static void printClassName(Object obj){
        System.out.println("\n" + obj.getClass().getSimpleName() + ":");
    }
}
