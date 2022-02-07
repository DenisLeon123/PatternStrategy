import ldan.piece.Piece;
import ldan.piece.behavior.attack.AttackHorizont;
import ldan.piece.behavior.attack.AttackVertical;
import ldan.piece.properties.Color;
import ldan.piece.properties.NamePiece;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Piece queen = new Piece(NamePiece.QUEEN, Color.WHITE);
        queen.setIAttackBehavior(Arrays.asList(new AttackHorizont(), new AttackVertical()));
        queen.getIAttackBehavior().forEach(piece -> piece.attack());
    }
}
