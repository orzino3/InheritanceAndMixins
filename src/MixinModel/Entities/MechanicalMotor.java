package MixinModel.Entities;

import MixinModel.Entities.Abstract.MechanicalDevice;
import MixinModel.Interfaces.Garage;
import MixinModel.Interfaces.Operable;
import MixinModel.Interfaces.Speed;

public class MechanicalMotor extends MechanicalDevice implements Speed, Operable, Garage {
    @Override
    public void operateDevice(){
        mechanicalInput();
        changeSpeed();
    }
}
