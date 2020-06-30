package be.vdab;

public abstract class Protozoa extends Animal {

    private boolean isParasitic;

    public boolean isParasitic() {
        return isParasitic;
    }

    public void setParasitic(boolean parasitic) {
        isParasitic = parasitic;
    }
}
