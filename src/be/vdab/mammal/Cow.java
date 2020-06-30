package be.vdab.mammal;

import be.vdab.Mammal;

public class Cow extends Mammal {

    private boolean hasHorns;

    public Cow(boolean canSwim, int numberOfLegs) {
        super(canSwim, numberOfLegs);
    }


    public boolean isHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }
}
