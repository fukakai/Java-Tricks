package fr.dalichamp.romain.designpatterns.abstractfatory.mages;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Army;

public class MageArmy implements Army {
    static final String DESCRIPTION = "This is the Mage Army!";

    @Override
    public String whoIsIt() {
        return DESCRIPTION;
    }
}
