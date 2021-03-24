package InterfaceSegregationPrinciple.five.controller;

public class DriveControllerManager implements DriveController {
    @Override
    public void drive() {
        System.out.println("drive");
    }
}
