package designpatterns.factory;

public class FactoryDesignPattern {
    public static void main(String[] args){
        CountryFactory countryFactory = new CountryFactory();

        Country england = countryFactory.visitCountry("queen");
        england.name();
        england.language();

        Country mexico = (Mexico) countryFactory.visitCountry("taco");
        mexico.name();
        mexico.language();
    }
}
