package InterfaceSegregationPrinciple.five.api;

/**
 * controller를 조작하는 상위 수준의 인터페이스
 *
 * 단일 책임 원칙과 인터페이스 분리 원칙을 모두 지켰다.
 * */
public interface Controller {
    void up();
    void down();
    void forward();
    void backward();
}
