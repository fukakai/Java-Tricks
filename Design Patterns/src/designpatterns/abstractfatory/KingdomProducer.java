package fr.dalichamp.romain.designpatterns.abstractfatory;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Army;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Castle;
import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Population;

public abstract class KingdomProducer {

    private Population Population;
    private Castle castle;
    private Army army;

    public void createKingdom(final KingdomFactory factory) {
        setPopulation(factory.createPopulation());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    /**
     * ########## Population ############
     */
    public Population getPopulation() {
        return Population;
    }
    Population getPopulation(final KingdomFactory factory) {
        return factory.createPopulation();
    }
    private void setPopulation(final Population population) {
        this.Population = population;
    }

    /**
     * ########## Castle ############
     */
    public Castle getCastle() {
        return castle;
    }
    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    /**
     * ########## Army ############
     */
    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }
}
