package MixinModel.Interfaces;

public interface LivingRoom {
    default void turnOnLivingRoom(){
        System.out.println("Turning on living room appliances: ");
    }
}
