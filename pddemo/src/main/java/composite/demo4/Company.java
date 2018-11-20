package composite.demo4;

/**
 * 这是一个公司与部门之间的抽象类!!
 */
public abstract  class Company {

    public void add(Company company ) throws Exception {
        throw new Exception("该方法尚未实现 ");
    };


    abstract void diaplay();

}
