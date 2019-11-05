package fr.dalichamp.romain.designpatterns.abstractfatory.mages;

import fr.dalichamp.romain.designpatterns.abstractfatory.KingdomFactory;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Army;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Castle;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Population;

public class MageFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new MageCastle();
    }

    @Override
    public Population createPopulation() {
        return new MagePopulation();
    }

    @Override
    public Army createArmy() {
        return new MageArmy();
    }
}
