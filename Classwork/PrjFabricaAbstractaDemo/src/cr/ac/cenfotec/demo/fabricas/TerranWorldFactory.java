package cr.ac.cenfotec.demo.fabricas;

import cr.ac.cenfotec.demo.bases.RaceBase;
import cr.ac.cenfotec.demo.bases.TerranBase;
import cr.ac.cenfotec.demo.gases.GasProcessor;
import cr.ac.cenfotec.demo.gases.TerranGasProcessor;

public class TerranWorldFactory extends WorldFactory {

    @Override
    public RaceBase createBase() {
        return new TerranBase();
    }

    @Override
    public GasProcessor createGasProcessor() {
        return new TerranGasProcessor();
    }
}
