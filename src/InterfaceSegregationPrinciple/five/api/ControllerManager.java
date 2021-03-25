package InterfaceSegregationPrinciple.five.api;

import InterfaceSegregationPrinciple.five.controller.*;

public class ControllerManager implements Controller {
    private FlyController flyController = new FlyControllerManager();
    private SailController sailController = new SailControllerManager();
    private DriveController driveController = new DriveControllerManager();

    @Override
    public void up() {
        flyController.fly();
        sailController.sail();
    }

    @Override
    public void down() {
        flyController.fly();
        sailController.sail();
    }

    @Override
    public void forward() {
        flyController.fly();
        driveController.drive();
    }

    @Override
    public void backward() {
        flyController.fly();
        driveController.drive();
    }
}
