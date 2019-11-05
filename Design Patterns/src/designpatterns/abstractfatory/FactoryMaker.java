package fr.dalichamp.romain.designpatterns.abstractfatory;

import fr.dalichamp.romain.designpatterns.abstractfatory.mages.MageFactory;
import fr.dalichamp.romain.designpatterns.abstractfatory.trolls.TrollFactory;

public class FactoryMaker {
    public enum KingdomType { MAGE, TROLL }

    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case MAGE:
                return new MageFactory();
            case TROLL:
                return new TrollFactory();
            default:
                throw new IllegalArgumentException("Not supported.");
        }
    }
}
