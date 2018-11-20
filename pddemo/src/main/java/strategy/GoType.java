package strategy;

public enum GoType {
    AIR(new Aircraft()),
    CAR(new Car()),
    TRAIN(new Train());

    TOLiJiang how2;

    public TOLiJiang getHow2() {
        return how2;
    }

    GoType(TOLiJiang how2){
        this.how2=how2;
    }

}
