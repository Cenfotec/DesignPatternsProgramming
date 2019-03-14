package cr.ac.cenfotec.demo.principal;

import cr.ac.cenfotec.demo.bases.RaceBase;
import cr.ac.cenfotec.demo.fabricas.FactoryGenerator;
import cr.ac.cenfotec.demo.fabricas.WorldFactory;
import cr.ac.cenfotec.demo.gases.GasProcessor;
import cr.ac.cenfotec.demo.races.Races;

public class Principal {
    public static void main(String[] args) {

        WorldFactory factory = new FactoryGenerator().getWorldFactory(Races.TERRAN);
        RaceBase base = factory.createBase();
        GasProcessor gasProc = factory.createGasProcessor();
    }
}
