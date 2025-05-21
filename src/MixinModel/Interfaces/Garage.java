package MixinModel.Interfaces;

public interface Garage {
    default void turnOnGarage(){
        System.out.print("Turning on garage appliances: ");
    }
}
