package MixinModel.Entities;

import MixinModel.Entities.Abstract.ElectronicDevice;
import MixinModel.Interfaces.Garage;
import MixinModel.Interfaces.Operable;
import MixinModel.Interfaces.Speed;

public class ElectricMotor extends ElectronicDevice implements Speed, Operable, Garage {
    @Override
    public void operateDevice(){
        switchOn();
        changeSpeed();
    }
}
