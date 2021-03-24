package InterfaceSegregationPrinciple.three.controller;

public class SailControllerManager implements SailController{
    @Override
    public void sail() {
        System.out.println("sail");
    }
}
