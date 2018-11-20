package flyweight.demo2;

public class BlackPiece extends Piece {
    @Override
    public String toString() {
        return "BlackPiece{" +
                "xPosition=" + super.getxPosition() +
                ", yPosition=" + super.getyPosition() +
                '}';
    }
}
