package ldan.piece.behavior.attack;

import ldan.piece.behavior.interfaceBehavior.IAttackBehavior;
import ldan.service.Print;

public class AttackDirectForOneVertical implements IAttackBehavior {
    @Override
    public void attack() {
        Print.printf("attack vertical of you by 1 step");
    }
}
