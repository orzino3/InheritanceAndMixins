package MixinModel.Entities;

import MixinModel.Entities.Abstract.ElectronicDevice;
import MixinModel.Interfaces.Audio;
import MixinModel.Interfaces.LivingRoom;
import MixinModel.Interfaces.Operable;

public class Speaker extends ElectronicDevice implements Audio, Operable, LivingRoom {
    @Override
    public void operateDevice(){
        switchOn();
        controlVolume();
    }
}
