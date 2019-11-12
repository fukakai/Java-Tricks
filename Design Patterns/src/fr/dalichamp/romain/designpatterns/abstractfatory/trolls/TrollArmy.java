package fr.dalichamp.romain.designpatterns.abstractfatory.trolls;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Army;

public class TrollArmy implements Army {
    static final String DESCRIPTION = "This is the Troll Army!";

    @Override
    public String whoIsIt() {
        return DESCRIPTION;
    }
}
