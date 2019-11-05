package fr.dalichamp.romain.designpatterns.abstractfatory.mages;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Castle;

public class MageCastle implements Castle {
    static final String DESCRIPTION = "This is the Mage Castle!";

    @Override
    public String whoIsIt() {
        return DESCRIPTION;
    }
}
