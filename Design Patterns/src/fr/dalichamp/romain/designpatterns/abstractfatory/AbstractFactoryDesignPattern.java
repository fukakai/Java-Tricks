package fr.dalichamp.romain.designpatterns.abstractfatory;

import fr.dalichamp.romain.designpatterns.abstractfatory.FactoryMaker.KingdomType;

public class AbstractFactoryDesignPattern extends KingdomProducer {

    public static void main(String[] args) {
        AbstractFactoryDesignPattern app = new AbstractFactoryDesignPattern();

        System.out.println("Mage Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.MAGE));
        System.out.println(app.getArmy().whoIsIt());
        System.out.println(app.getCastle().whoIsIt());
        System.out.println(app.getPopulation().whoIsIt());

        System.out.println("Troll Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.TROLL));
        System.out.println(app.getArmy().whoIsIt());
        System.out.println(app.getCastle().whoIsIt());
        System.out.println(app.getPopulation().whoIsIt());
    }
}
