package flyweight.demo2;

/**
 * 这里是模拟围棋的棋子对象的创建，棋子的内部状态都是一样的，黑色白色。圆形。不同的是位置的区别
 */
public class TestPieceDemo {
    public static void main(String[] args) {
        Piece p1 = PieceFactory.getPiece(Type.BLACK);
        Piece p2 = PieceFactory.getPiece(Type.BLACK);
        Piece p3 = PieceFactory.getPiece(Type.WHITE);
        Piece p4 = PieceFactory.getPiece(Type.WHITE);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
