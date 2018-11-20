package composite.demo4;


import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{

    private String name;
    private List<Company> list=new ArrayList<Company>();

    public ConcreteCompany(String name) {
        this.name = name;
    }

    @Override
    public void add(Company company){
        list.add(company);
    }

    @Override
    void diaplay() {
        System.out.println(name);
        for (Company c:list) {
            c.diaplay();
        }
    }
}
