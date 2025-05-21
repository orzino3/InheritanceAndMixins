package MixinModel.Entities;

import MixinModel.Entities.Abstract.ElectronicDevice;
import MixinModel.Interfaces.Kitchen;
import MixinModel.Interfaces.Operable;
import MixinModel.Interfaces.Temperature;

public class Fridge extends ElectronicDevice implements Temperature, Operable, Kitchen {

    @Override
    public void operateDevice(){
        switchOn();
        changeTemperature();
    }
}
