package cr.ac.cenfotec.demo.fabricas;

import cr.ac.cenfotec.demo.bases.RaceBase;
import cr.ac.cenfotec.demo.gases.GasProcessor;

public abstract class WorldFactory {

    public abstract RaceBase createBase();
    public abstract GasProcessor createGasProcessor();
}
