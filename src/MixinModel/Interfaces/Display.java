package MixinModel.Interfaces;

public interface Display {

    default void changeResolution(){
        System.out.println("Changing Resolution...");
    }
}
