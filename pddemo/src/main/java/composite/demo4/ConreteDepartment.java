package composite.demo4;

/**
 * 这是具体的实现部门
 */
public class ConreteDepartment extends Company{
    private String name;

    public ConreteDepartment(String name) {
        this.name = name;
    }
    @Override
    void diaplay() {
        System.out.println(name);
    }
}
