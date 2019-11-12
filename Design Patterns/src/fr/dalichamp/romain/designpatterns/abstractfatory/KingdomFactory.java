package fr.dalichamp.romain.designpatterns.abstractfatory;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Army;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Castle;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Population;

public interface KingdomFactory {
    Castle createCastle();
    Population createPopulation();
    Army createArmy();
}
