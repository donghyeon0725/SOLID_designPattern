package InterfaceSegregationPrinciple.four.api;

import four.api.controller.DriveControllerManager;
import four.api.controller.DronController;
import four.api.controller.FlyControllerManager;
import four.api.controller.SailControllerManager;

public class ControllerFacade implements DronController {

    @Override
    public void fly() {
        FlyControllerManager manager = new FlyControllerManager();
        manager.fly();
    }

    @Override
    public void drive() {
        DriveControllerManager manager = new DriveControllerManager();
        manager.drive();
    }

    @Override
    public void sail() {
        SailControllerManager manager = new SailControllerManager();
        manager.sail();
    }
}
