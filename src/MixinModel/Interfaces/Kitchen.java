package MixinModel.Interfaces;

public interface Kitchen {
    default void turnOnKitchen(){
        System.out.println("Turning on kitchen appliances: ");
    }
}
