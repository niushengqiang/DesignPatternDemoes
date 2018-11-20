package facade.demo2;

/**
 * 创建一个外观类。
 * 这里只是将底层的实现又封装了一层.可以调用它来调用所有的实现类,而不用单个调用某些实现类
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
