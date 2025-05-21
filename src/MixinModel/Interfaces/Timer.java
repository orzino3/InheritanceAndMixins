package MixinModel.Interfaces;

public interface Timer {
    default void setTimer(){
        System.out.println("Setting timer...");
    }
}
