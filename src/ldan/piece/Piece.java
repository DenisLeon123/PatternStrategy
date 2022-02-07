package ldan.piece;

import ldan.piece.behavior.interfaceBehavior.IAttackBehavior;
import ldan.piece.behavior.interfaceBehavior.IMoveBehavior;
import ldan.piece.properties.Color;
import ldan.piece.properties.NamePiece;

import java.util.List;

public class Piece {
    private final NamePiece namePiece;
    private final Color color;
    private List<IMoveBehavior> IMoveBehavior;
    private List<IAttackBehavior> IAttackBehavior;

    public Piece(NamePiece namePiece, Color color) {
        this.namePiece = namePiece;
        this.color = color;
    }

    public NamePiece getNamePiece() {
        return namePiece;
    }

    public Color getColor() {
        return color;
    }

    public List<ldan.piece.behavior.interfaceBehavior.IMoveBehavior> getIMoveBehavior() {
        return IMoveBehavior;
    }

    public List<ldan.piece.behavior.interfaceBehavior.IAttackBehavior> getIAttackBehavior() {
        return IAttackBehavior;
    }

    public void setIMoveBehavior(List<IMoveBehavior> IMoveBehavior) {
        this.IMoveBehavior = IMoveBehavior;
    }

    public void setIAttackBehavior(List<IAttackBehavior> IAttackBehavior) {
        this.IAttackBehavior = IAttackBehavior;
    }
}
