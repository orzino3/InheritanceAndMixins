package MixinModel;

import MixinModel.Constants.Constants;
import MixinModel.Entities.Remote;
import MixinModel.Interfaces.Operable;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Remote remote = new Remote();
        List<Operable> devices = Constants.DEVICES_LIST;

        while (true){
            printMainMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            String category;

            switch (option){
                case 1:
                    remote.operateAllDevices(devices);
                    break;

                case 2:
                    printDevicesCategory();
                    category = scanner.nextLine();
                    remote.operateByCategory(devices,category);
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;
            }
        }
    }

    private static void printMainMenu(){
        System.out.println("""
                _______________________________
                
                Mixin controlled appliances.
                
                1) Operate all devices
                2) Operate by specific category
                3) Terminate
                
                _______________________________
                """);
    }

    private static void printDevicesCategory(){
        System.out.println("""
                _______________________________
                
                Choose a category:
                
                1) Audio
                2) Speed
                3) Temperature
                4) Timer
                5) Display
                6) Kitchen
                7) Garage
                8) Living Room
                
                _______________________________
                """);
    }
}
