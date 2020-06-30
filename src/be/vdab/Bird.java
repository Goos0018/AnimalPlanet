package be.vdab;

public abstract class Bird extends Animal implements Breathable{

    private String featherColor;
    private boolean canFly;

    @Override
    public void breathe() {
        System.out.println("Birdy breathes go GHA GHA");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
