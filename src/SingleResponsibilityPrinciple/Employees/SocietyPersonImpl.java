package SingleResponsibilityPrinciple.Employees;

public class SocietyPersonImpl implements SocietyPerson {
    private Integer id;
    private String name;

    public SocietyPersonImpl(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getUserID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
