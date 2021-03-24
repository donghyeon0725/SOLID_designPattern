package InterfaceSegregationPrinciple.two.controller;

import two.controller.module.DriveController;
import two.controller.module.FlyController;
import two.controller.module.SailController;

public interface DronController extends FlyController, DriveController, SailController {
    void fly();
    void drive();
    void sail();
}
