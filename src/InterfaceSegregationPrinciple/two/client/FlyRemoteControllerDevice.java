package InterfaceSegregationPrinciple.two.client;

import two.controller.module.FlyController;

/**
 * 클라이언트 입장에서 쓸모 없는 drive 메소드도 알게 됨
 * */
public class FlyRemoteControllerDevice {
    private FlyController flyController;

    public FlyRemoteControllerDevice(FlyController flyController) {
        this.flyController = flyController;
    }

    public void fly() {
        flyController.fly();
    }
}
