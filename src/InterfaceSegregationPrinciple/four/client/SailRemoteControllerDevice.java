package InterfaceSegregationPrinciple.four.client;

import four.api.controller.DronController;

public class SailRemoteControllerDevice {
    private DronController dronController;

    public SailRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void sail() {
        dronController.sail();
    }
}
