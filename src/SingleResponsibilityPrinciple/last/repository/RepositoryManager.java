package SingleResponsibilityPrinciple.last.repository;

public class RepositoryManager {
    public static Repository repository = new RepositoryImpl();

    private RepositoryManager() {}

    public static Repository getInstance() {
        return repository;
    }

}
