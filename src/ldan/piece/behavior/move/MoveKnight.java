package ldan.piece.behavior.move;

import ldan.piece.behavior.interfaceBehavior.IMoveBehavior;
import ldan.service.Print;

public class MoveKnight implements IMoveBehavior {
    @Override
    public void move() {
        Print.printf("move piece for knight");
    }
}
