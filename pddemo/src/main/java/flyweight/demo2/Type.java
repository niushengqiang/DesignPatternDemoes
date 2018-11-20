package flyweight.demo2;

public enum Type {
    BLACK("black"),WHITE("white");

    String color;
    Type(String color) {
        this.color = color;
    }
}
