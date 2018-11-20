package facade.demo1;

/*
* cpu具有计算执行等功能
* */
public class CPU {
    public void jump(long position) {
        System.out.println("跳跃到"+position+"的位置");

    }
    public void execute() {
        System.out.println("执行计算功能");
    }
}
