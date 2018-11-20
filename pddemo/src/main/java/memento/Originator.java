package memento;

/**
 * 发起者类,可创造备忘录对象.
 * 也可以将备忘录对象还原为本对象
 */
public class Originator {
   private  String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public  Memento save2AMemento(){
        return  new Memento(status);
    }

    public void fromMemento2Originator(Memento m){
        this.status=m.getStatus();
    }

    @Override
    public String toString() {
        return "当前的形态为{" + status + '\'' +'}';
    }
}
