package InterfaceSegregationPrinciple.five.controller;

public class SailControllerManager implements SailController{
    @Override
    public void sail() {
        System.out.println("sail");
    }
}
