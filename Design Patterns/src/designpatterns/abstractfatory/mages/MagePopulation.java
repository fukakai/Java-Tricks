package fr.dalichamp.romain.designpatterns.abstractfatory.mages;

import fr.dalichamp.romain.designpatterns.abstractfatory.actions.Population;

public class MagePopulation implements Population {
        static final String DESCRIPTION = "This is the Mage Population!";

        @Override
        public String whoIsIt() {
                return DESCRIPTION;
        }
}
