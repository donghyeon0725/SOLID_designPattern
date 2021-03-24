package InterfaceSegregationPrinciple.five.client;

import five.api.Controller;

/**
 * 사용자가 사용하는 입장에서 각각의 Controller를 주입받는 것이 아닌, 중심이 될 Controller를 주입 받고, 그것을 통해서 인터페이스에 접근함으로써
 * ISP 원칙을 위반하지 않게 되었다.
 * 그리고 "드론을 컨트롤 하기 위한 목적"이라는 단일 책임 원칙도 위배 되지 않는다.
 * */
public class RemoteControllerDevice {
    Controller controller;

    public RemoteControllerDevice(Controller controller) {
        this.controller = controller;
    }

    public void main() {
        controller.up();
        controller.down();
        controller.backward();
        controller.forward();
    }
}
