package InterfaceSegregationPrinciple.four.client;


import InterfaceSegregationPrinciple.four.api.controller.DronController;

public class SailRemoteControllerDevice {
    private DronController dronController;

    public SailRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void sail() {
        dronController.sail();
    }
}
