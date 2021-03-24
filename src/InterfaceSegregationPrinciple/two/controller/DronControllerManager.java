package InterfaceSegregationPrinciple.two.controller;

import two.controller.DronController;

/**
 * 이것을 각각의 컨트롤러가 주입 받는다.
 * 각각의 인터페이스로 이 구현체를 받으면 인터페이스가 제공하지 않는 메소드는 사용이 불가능하게 된다. => 인터페이스 분리 원칙은 지키게 되었다.
 * */
public class DronControllerManager implements DronController {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void sail() {
        System.out.println("sail");
    }
}
