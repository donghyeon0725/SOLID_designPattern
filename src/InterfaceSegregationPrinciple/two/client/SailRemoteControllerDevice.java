package InterfaceSegregationPrinciple.two.client;


import InterfaceSegregationPrinciple.two.controller.module.SailController;

public class SailRemoteControllerDevice {
    private SailController sailController;

    public SailRemoteControllerDevice(SailController sailController) {
        this.sailController = sailController;
    }

    public void sail() {
        sailController.sail();
    }
}
