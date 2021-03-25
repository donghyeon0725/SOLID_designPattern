package InterfaceSegregationPrinciple.two.controller;


import InterfaceSegregationPrinciple.two.controller.module.*;

public interface DronController extends FlyController, DriveController, SailController {
    void fly();
    void drive();
    void sail();
}
