package MixinModel.Interfaces;

public interface Audio {

    default void controlVolume(){
        System.out.println("Controlling Volume...");
    }
}
