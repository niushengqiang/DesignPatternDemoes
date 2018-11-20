package memento;

/**
 * 备忘录模式测试类
 */
public class MementoDemoTest {
    public static void main(String[] args) {
        //设置一个对象管理者
        CareTaker careTaker = new CareTaker();

        //进行状态的改变
        Originator digitalBaby  = new Originator();
        digitalBaby.setStatus("成长期");
        System.out.println(digitalBaby.toString());
        careTaker.add(digitalBaby.save2AMemento());
        digitalBaby.setStatus("成熟期");
        System.out.println(digitalBaby.toString());
        careTaker.add(digitalBaby.save2AMemento());
        digitalBaby.setStatus("完全体");
        System.out.println(digitalBaby.toString());
        careTaker.add(digitalBaby.save2AMemento());
        digitalBaby.setStatus("究极体");
        System.out.println(digitalBaby.toString());
        careTaker.add(digitalBaby.save2AMemento());

        //进行状态的还原
        digitalBaby.fromMemento2Originator(careTaker.get(0));
        System.out.println(digitalBaby.toString());
        digitalBaby.fromMemento2Originator(careTaker.get(1));
        System.out.println(digitalBaby.toString());
        digitalBaby.fromMemento2Originator(careTaker.get(2));
        System.out.println(digitalBaby.toString());
        digitalBaby.fromMemento2Originator(careTaker.get(3));
        System.out.println(digitalBaby.toString());
    }
}
