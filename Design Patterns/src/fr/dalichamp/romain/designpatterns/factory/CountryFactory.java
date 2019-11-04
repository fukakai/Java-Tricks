package fr.dalichamp.romain.designpatterns.factory;

public class CountryFactory implements Travel{
    @Override
    public Country visitCountry(String criteria) {
        if (criteria.equals("queen")) return new England();
        if (criteria.equals("taco")) return new Mexico();
        return null;
    }
}
