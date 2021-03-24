package InterfaceSegregationPrinciple.two.client;

import two.controller.module.DriveController;

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
