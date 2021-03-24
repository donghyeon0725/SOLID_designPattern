package InterfaceSegregationPrinciple.three.client;

import three.controller.DriveController;

/**
 * 클라이언트 입장
 * */
public class DriveRemoteControllerDevice {
    private DriveController driveController;

    public DriveRemoteControllerDevice(DriveController driveController) {
        this.driveController = driveController;
    }

    public void drive() {
        driveController.drive();
    }

}
