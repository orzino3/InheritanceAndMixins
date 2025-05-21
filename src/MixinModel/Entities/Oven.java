package MixinModel.Entities;

import MixinModel.Entities.Abstract.ElectronicDevice;
import MixinModel.Interfaces.Kitchen;
import MixinModel.Interfaces.Operable;
import MixinModel.Interfaces.Temperature;
import MixinModel.Interfaces.Timer;

public class Oven extends ElectronicDevice implements Temperature, Timer, Operable, Kitchen {

    @Override
    public void operateDevice(){
        switchOn();
        changeTemperature();
        setTimer();
    }
}
