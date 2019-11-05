package fr.dalichamp.romain.designpatterns.abstractfatory.trolls;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Population;

public class TrollPopulation implements Population {
    static final String DESCRIPTION = "This is the Troll Population!";

    @Override
    public String whoIsIt() {
        return DESCRIPTION;
    }
}
