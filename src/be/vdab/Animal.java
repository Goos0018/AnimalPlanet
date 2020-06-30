package be.vdab;

public abstract class Animal {

    private String name;
    private double weight;
    private String sex;
    private int age;
    private String diet;

    public enum Diet {
        CARNIVORE,
        HERBIVORE,
        OMNIVORE,
    }
}