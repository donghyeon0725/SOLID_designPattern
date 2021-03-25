package SingleResponsibilityPrinciple.last.PerformanceManager;

import SingleResponsibilityPrinciple.last.repository.Repository;
import SingleResponsibilityPrinciple.last.repository.RepositoryManager;

public class PerformanceCalculatorManager {
    private static PerformanceCalculator performanceCalculator = new PerformanceCalculatorImpl(RepositoryManager.getInstance());

    private PerformanceCalculatorManager(Repository repository) {}

    public static PerformanceCalculator getInstance() {
        return performanceCalculator;
    }
}
