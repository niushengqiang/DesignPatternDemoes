package composite.demo4;

public class TestCompositeMode {

    public static void main(String[] args){
        createMode().diaplay();
    }


    public static Company createMode(){
        ConcreteCompany bjCompany = new ConcreteCompany("北京总公司");
        bjCompany.add( new ConreteDepartment("人事部"));
        bjCompany.add( new ConreteDepartment("行政部"));
        bjCompany.add( new ConreteDepartment("研发部"));
        bjCompany.add( new ConreteDepartment("售后部"));
        bjCompany.add( new ConreteDepartment("销售部"));

        ConcreteCompany shCompany = new ConcreteCompany("上海分公司");
        shCompany.add( new ConreteDepartment("销售部"));
        shCompany.add( new ConreteDepartment("售后部"));

        ConcreteCompany gzCompany = new ConcreteCompany("广州分公司");
        gzCompany.add( new ConreteDepartment("销售部"));
        gzCompany.add( new ConreteDepartment("售后部"));

        ConcreteCompany szCompany = new ConcreteCompany("深圳分公司");
        szCompany.add( new ConreteDepartment("销售部"));
        szCompany.add( new ConreteDepartment("售后部"));

        bjCompany.add(shCompany);
        bjCompany.add(gzCompany);
        bjCompany.add(szCompany);
        return bjCompany;
    }
}
