package cr.ac.cenfotec.demo.fabricas;

import cr.ac.cenfotec.demo.bases.RaceBase;
import cr.ac.cenfotec.demo.bases.ZergBase;
import cr.ac.cenfotec.demo.gases.GasProcessor;
import cr.ac.cenfotec.demo.gases.ZergGasProcessor;

public class ZergWorldFactory extends WorldFactory {
    @Override
    public RaceBase createBase() {
        return new ZergBase();
    }

    @Override
    public GasProcessor createGasProcessor() {
        return new ZergGasProcessor();
    }
}
