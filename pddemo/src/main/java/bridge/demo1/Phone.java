package bridge.demo1;

/**
 * 这是一个手机的抽象类
 */
public abstract  class Phone {

    private PhoneSoftWare software;

    public Phone(PhoneSoftWare software) {
        this.software = software;
    }

    public void execSoft(){
        software.exec();
    }

}
