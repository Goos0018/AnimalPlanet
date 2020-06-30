package be.vdab;

public abstract class Mammal extends Animal implements Breathable {

    private boolean canSwim;
    private int numberOfLegs;

    public Mammal(boolean canSwim, int numberOfLegs) {
        this.canSwim = canSwim;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void breathe() {
        System.out.println("Mammal breathes go HU HU");
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
