package InterfaceSegregationPrinciple.three.client;

import three.controller.SailController;

public class SailRemoteControllerDevice {
    private SailController sailController;

    public SailRemoteControllerDevice(SailController sailController) {
        this.sailController = sailController;
    }

    public void sail() {
        sailController.sail();
    }
}
