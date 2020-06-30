package be.vdab.mammal;

import be.vdab.Mammal;

public class Cow extends Mammal {

    private boolean hasHorns;

    public Cow(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    public boolean isHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }
}
