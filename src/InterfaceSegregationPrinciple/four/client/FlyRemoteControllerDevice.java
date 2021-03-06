package InterfaceSegregationPrinciple.four.client;

import InterfaceSegregationPrinciple.four.api.controller.DronController;

public class FlyRemoteControllerDevice {
    private DronController dronController;

    public FlyRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void fly() {
        dronController.fly();
    }
}
