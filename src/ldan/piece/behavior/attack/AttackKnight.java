package ldan.piece.behavior.attack;

import ldan.piece.behavior.interfaceBehavior.IAttackBehavior;
import ldan.service.Print;

public class AttackKnight implements IAttackBehavior {
    @Override
    public void attack() {
        Print.printf("attack knight");
    }
}
