package SingleResponsibilityPrinciple.PerformanceManager;

import SingleResponsibilityPrinciple.repository.Repository;
import SingleResponsibilityPrinciple.repository.RepositoryManager;

public class PerformanceCalculatorManager {
    private static PerformanceCalculator performanceCalculator = new PerformanceCalculatorImpl(RepositoryManager.getInstance());

    private PerformanceCalculatorManager(Repository repository) {}

    public static PerformanceCalculator getInstance() {
        return performanceCalculator;
    }
}
