package InterfaceSegregationPrinciple.one;

/**
 * 클라이언트가 DronController 인터페이스 구현체를 주입받고 있다.
 * 그리고 DronController가 제공하는 메소드인 fly에 접근이 가능하다.
 * */
public class DriveRemoteControllerDevice {
    private DronController dronController;

    public DriveRemoteControllerDevice(DronController dronController) {
        this.dronController = dronController;
    }

    public void drive() {
        dronController.drive();
    }

}
