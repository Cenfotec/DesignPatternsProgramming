package cr.ac.cenfotec.demo.bases;

public abstract class RaceBase {
    protected int level;
    protected int coordX;
    protected int coordY;
    protected int mineralAmount;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getMineralAmount() {
        return mineralAmount;
    }

    public void setMineralAmount(int mineralAmount) {
        this.mineralAmount = mineralAmount;
    }
}

