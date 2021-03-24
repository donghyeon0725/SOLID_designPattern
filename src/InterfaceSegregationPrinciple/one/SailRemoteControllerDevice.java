package InterfaceSegregationPrinciple.one;

public class SailRemoteControllerDevice {
    private DronController dronController;

    public SailRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void sail() {
        dronController.sail();
    }
}
