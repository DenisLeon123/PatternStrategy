package ldan.piece.behavior.attack;

import ldan.piece.behavior.interfaceBehavior.IAttackBehavior;
import ldan.service.Print;

public class AttackHorizont implements IAttackBehavior {
    @Override
    public void attack() {
        Print.printf("attack horizont of you");
    }
}
