package command.mydemo1;

public class TestForLunch {
    public static void main(String[] args){
        Commander wings = new BBQForChickenWings(1);
        Commander wings2 = new BBQForChickenWings(1);
        Commander Sshshlik = new BBQForMuttonShashlik(1);
        Waiter waiter = new Waiter();
        waiter.orderFood(wings);
        waiter.orderFood(wings2);
        waiter.orderFood(Sshshlik);
        waiter.over();
    }
}
