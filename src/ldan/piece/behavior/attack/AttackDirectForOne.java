package ldan.piece.behavior.attack;

import ldan.piece.behavior.interfaceBehavior.IAttackBehavior;
import ldan.service.Print;

public class AttackDirectForOne implements IAttackBehavior {
    @Override
    public void attack() {
        Print.printf("attack right in front of you");
    }
}
