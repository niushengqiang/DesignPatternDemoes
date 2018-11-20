package decorator.demo2;

public class TestDecorator {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge("18");
        person.setSex("男");
        //这里将执行的过程封装到了客户端,对于过程的删减维护有着良好的替换和增减功能
        IDressing dressCoat = new DressCoat(null);
        IDressing dressDressSocks = new DressSocks(dressCoat);
        IDressing dressDressTrousers = new DressTrousers(dressDressSocks);
        IDressing dressDressUnderpants = new DressUnderpants(dressDressTrousers);

        dressDressUnderpants.dress(person);
        System.out.println(person);
    }
}
