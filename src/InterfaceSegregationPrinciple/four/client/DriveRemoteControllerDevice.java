package InterfaceSegregationPrinciple.four.client;


import InterfaceSegregationPrinciple.four.api.controller.DronController;

public class DriveRemoteControllerDevice {
    private DronController dronController;

    public DriveRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void drive() {
        dronController.drive();
    }

}
