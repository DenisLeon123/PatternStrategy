package ldan.piece.behavior.attack;

import ldan.piece.behavior.interfaceBehavior.IAttackBehavior;
import ldan.service.Print;

public class AttackVertical implements IAttackBehavior {
    @Override
    public void attack() {
        Print.printf("attack vertical of you");
    }
}
