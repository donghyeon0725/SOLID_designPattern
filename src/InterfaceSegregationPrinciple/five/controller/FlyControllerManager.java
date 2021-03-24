package InterfaceSegregationPrinciple.five.controller;

public class FlyControllerManager implements FlyController{

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
