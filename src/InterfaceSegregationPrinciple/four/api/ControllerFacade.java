package InterfaceSegregationPrinciple.four.api;

import InterfaceSegregationPrinciple.four.api.controller.DriveControllerManager;
import InterfaceSegregationPrinciple.four.api.controller.DronController;
import InterfaceSegregationPrinciple.four.api.controller.FlyControllerManager;
import InterfaceSegregationPrinciple.four.api.controller.SailControllerManager;

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
