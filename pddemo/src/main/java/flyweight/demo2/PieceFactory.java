package flyweight.demo2;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {

    private  static final Map<Type,Piece> map=new HashMap<>();

    public static Piece getPiece(Type t){
        Piece piece = map.get(t);
        if(piece==null){
            System.out.println("创建新的实例对象");
            switch (t){
                case BLACK:piece=new BlackPiece();
                    map.put(Type.BLACK,piece);
                    break;
                case WHITE:piece=new WhitePiece();
                    map.put(Type.WHITE,piece);
                    break;
            }
        }
        return piece;
    }


}
