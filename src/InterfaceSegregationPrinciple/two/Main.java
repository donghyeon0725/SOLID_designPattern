package InterfaceSegregationPrinciple.two;


import InterfaceSegregationPrinciple.two.client.FlyRemoteControllerDevice;
import InterfaceSegregationPrinciple.two.controller.DronController;
import InterfaceSegregationPrinciple.two.controller.DronControllerManager;

public class Main {
    public static void main(String[] args) {
        DronController dronController = new DronControllerManager();

        FlyRemoteControllerDevice controller = new FlyRemoteControllerDevice(dronController);
        // FlyRemoteControllerDevice 는 FlyController
    }
}
