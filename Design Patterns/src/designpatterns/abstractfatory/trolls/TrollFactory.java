package fr.dalichamp.romain.designpatterns.abstractfatory.trolls;

import fr.dalichamp.romain.designpatterns.abstractfatory.KingdomFactory;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Army;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Castle;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Population;

public class TrollFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new TrollCastle();
    }

    @Override
    public Population createPopulation() {
        return new TrollPopulation();
    }

    @Override
    public Army createArmy() {
        return new TrollArmy();
    }
}
