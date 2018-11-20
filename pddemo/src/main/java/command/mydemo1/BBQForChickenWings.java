package command.mydemo1;

public class BBQForChickenWings implements Commander{
    private Chef chef=new Chef();
    private int num;

    public BBQForChickenWings( int num) {
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
        chef.cookingchickenWings(this.num);
    }
}
