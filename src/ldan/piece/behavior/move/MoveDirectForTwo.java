package ldan.piece.behavior.move;

import ldan.piece.behavior.interfaceBehavior.IMoveBehavior;
import ldan.service.Print;

public class MoveDirectForTwo implements IMoveBehavior {
    @Override
    public void move() {
        Print.printf("move piece on 2 step forward");
    }
}
