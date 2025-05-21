package MixinModel.Interfaces;

public  interface Temperature  {

    default void changeTemperature(){
        System.out.println("Changing temperature...");
    }
}
