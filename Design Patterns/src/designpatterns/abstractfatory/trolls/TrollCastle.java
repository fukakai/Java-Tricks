package fr.dalichamp.romain.designpatterns.abstractfatory.trolls;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Castle;

public class TrollCastle implements Castle {
    static final String DESCRIPTION = "This is the Troll Castle!";

    @Override
    public String whoIsIt() {
        return DESCRIPTION;
    }
}
