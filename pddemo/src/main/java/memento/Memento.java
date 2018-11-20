package memento;

public class Memento {

    private  String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Memento(String status) {
        this.status = status;
    }

    public Memento() {
    }
}
