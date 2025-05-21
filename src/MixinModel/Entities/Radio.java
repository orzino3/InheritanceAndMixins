package MixinModel.Entities;

import MixinModel.Entities.Abstract.FrequencyDevice;
import MixinModel.Interfaces.Audio;
import MixinModel.Interfaces.LivingRoom;
import MixinModel.Interfaces.Operable;

public class Radio extends FrequencyDevice implements Audio, Operable, LivingRoom {
    @Override
    public void operateDevice(){
        switchOn();
        channelTuning();
        controlVolume();
    }
}
