package flyweight.demo2;

public class WhitePiece extends Piece {
    @Override
    public String toString() {
        return "WhitePiece{" +
                "xPosition=" + super.getxPosition() +
                ", yPosition=" + super.getyPosition() +
                '}';
    }

}
