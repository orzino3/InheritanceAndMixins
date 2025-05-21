package MixinModel.Interfaces;

public interface Speed {
    default void changeSpeed(){
        System.out.println("Changing Speed...");
    }
}
