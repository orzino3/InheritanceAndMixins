package MixinModel.Entities;

import MixinModel.Entities.Abstract.FrequencyDevice;
import MixinModel.Interfaces.*;

public class Television extends FrequencyDevice implements Audio, Display, Timer, Operable, LivingRoom {
    @Override
    public void operateDevice(){
        switchOn();
        channelTuning();
        changeResolution();
        controlVolume();
    }
}
