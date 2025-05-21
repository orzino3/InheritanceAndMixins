package MixinModel.Entities;

import MixinModel.Constants.Constants;
import MixinModel.Interfaces.*;

import java.util.List;

public class Remote {

    public void operateAllDevices(List<Operable> devices) {
        System.out.println("""
                Operating all devices:
                ---------------------------
                """);

        for (Operable device : devices) {
            System.out.println(device.getClass().getSimpleName() + "\n");
            device.operateDevice();
            System.out.println("---------------------------");
        }
    }

    public void operateByCategory(List<Operable> devices, String category) {

        System.out.println("Operating category: " + category);
        System.out.println("_______________________________");

        for (Operable device : devices) {
            switch (category.toUpperCase()) {
                case "AUDIO" -> operateAudio(device);
                case "SPEED" -> operateSpeed(device);
                case "TEMPERATURE" -> operateTemperature(device);
                case "TIMER" -> operateTimer(device);
                case "DISPLAY" -> operateDisplay(device);
                case "KITCHEN" -> operateKitchen(device);
                case "GARAGE" -> operateGarage(device);
                case "LIVING ROOM" -> operateLivingRoom(device);
            }
        }
        System.out.println("_______________________________");
    }


    private void operateAudio(Operable device) {
        if (device instanceof Audio audio) {
            Constants.printClassName(device);
            audio.controlVolume();
        }
    }

    private void operateSpeed(Operable device) {
        if (device instanceof Speed speed) {
            Constants.printClassName(device);
            speed.changeSpeed();
        }
    }

    private void operateTemperature(Operable device) {
        if (device instanceof Temperature temp) {
            Constants.printClassName(device);
            temp.changeTemperature();
        }
    }

    private void operateTimer(Operable device) {
        if (device instanceof Timer timer) {
            Constants.printClassName(device);
            timer.setTimer();
        }
    }

    private void operateDisplay(Operable device) {
        if (device instanceof Display display) {
            Constants.printClassName(device);
            display.changeResolution();
        }
    }

    private void operateKitchen(Operable device) {
        if (device instanceof Kitchen kitchen) {
            kitchen.turnOnKitchen();
            Constants.printClassName(device);
            device.operateDevice();
        }
    }

    private void operateGarage(Operable device) {
        if (device instanceof Garage garage) {
            garage.turnOnGarage();
            Constants.printClassName(device);
            device.operateDevice();
        }
    }

    private void operateLivingRoom(Operable device) {
        if (device instanceof LivingRoom livingRoom) {
            livingRoom.turnOnLivingRoom();
            Constants.printClassName(device);
            device.operateDevice();
        }
    }
}
