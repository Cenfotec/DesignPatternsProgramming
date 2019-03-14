package cr.ac.cenfotec.demo.fabricas;

import cr.ac.cenfotec.demo.races.Races;

public class FactoryGenerator {

    public static WorldFactory getWorldFactory(Races race) {
        switch(race) {
            case TERRAN:
                return new TerranWorldFactory();
            case ZERG:
                return new ZergWorldFactory();
            default:
                throw new RuntimeException("Invalid option");
        }
    }
}
