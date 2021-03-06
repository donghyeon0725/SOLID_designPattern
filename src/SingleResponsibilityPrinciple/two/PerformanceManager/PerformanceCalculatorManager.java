package SingleResponsibilityPrinciple.two.PerformanceManager;


import SingleResponsibilityPrinciple.last.repository.Repository;
import SingleResponsibilityPrinciple.two.repository.RepositoryManager;

public class PerformanceCalculatorManager {
    private static PerformanceCalculator performanceCalculator = new PerformanceCalculatorImpl(RepositoryManager.getInstance());

    private PerformanceCalculatorManager(Repository repository) {}

    public static PerformanceCalculator getInstance() {
        return performanceCalculator;
    }
}
