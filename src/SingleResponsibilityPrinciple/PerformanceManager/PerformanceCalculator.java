package SingleResponsibilityPrinciple.PerformanceManager;

import SingleResponsibilityPrinciple.Employees.SocietyPerson;

public interface PerformanceCalculator {
    public Money calculatePay(SocietyPerson employee);
}
