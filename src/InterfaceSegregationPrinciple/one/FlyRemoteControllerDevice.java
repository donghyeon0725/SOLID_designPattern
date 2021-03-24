package InterfaceSegregationPrinciple.one;

/**
 * 클라이언트 입장에서 쓸모 없는 drive 메소드도 알게 됨
 * */
public class FlyRemoteControllerDevice {
    private DronController dronController;

    public FlyRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void fly() {
        dronController.fly();
    }
}
