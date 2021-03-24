package InterfaceSegregationPrinciple.two;

import two.client.FlyRemoteControllerDevice;
import two.controller.DronController;
import two.controller.DronControllerManager;

public class Main {
    public static void main(String[] args) {
        DronController dronController = new DronControllerManager();

        FlyRemoteControllerDevice controller = new FlyRemoteControllerDevice(dronController);
        // FlyRemoteControllerDevice 는 FlyController
    }
}
