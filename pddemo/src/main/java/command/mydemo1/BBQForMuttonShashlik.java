package command.mydemo1;

public class BBQForMuttonShashlik implements Commander{

    private Chef chef=new Chef();
    private int num;

    public BBQForMuttonShashlik(int num) {
        this.num = num;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void bbq() {
        chef.cookingMuttonShashlik(this.num);
    }
}
