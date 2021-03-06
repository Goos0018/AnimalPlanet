package be.vdab.zoo;

import be.vdab.Animal;
import be.vdab.Bird;
import be.vdab.bird.Cockatiel;
import be.vdab.bird.Eagle;
import be.vdab.bird.Owl;

public class BirdZoo extends Zoo {

    private Cockatiel[] cockatiels;
    private Eagle[] eagles;
    private Owl[] owls;

    public BirdZoo() {
        cockatiels = new Cockatiel[0];
        eagles = new Eagle[0];
        owls = new Owl[0];
    }

    public Cockatiel[] getCockatiels() {
        return cockatiels;
    }

    public void setCockatiels(Cockatiel[] cockatiels) {
        this.cockatiels = cockatiels;
    }

    public Eagle[] getEagles() {
        return eagles;
    }

    public void setEagles(Eagle[] eagles) {
        this.eagles = eagles;
    }

    public Owl[] getOwls() {
        return owls;
    }

    public void setOwls(Owl[] owls) {
        this.owls = owls;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (!(animal instanceof Bird)) {
            System.out.println(animal.getName() + " is not a bird, it doesn't belong here.");
            return;
        } else if (animal instanceof Cockatiel) {
            Cockatiel[] result = new Cockatiel[cockatiels.length + 1];
            for (int i = 0; i < cockatiels.length; i++) {
                result[i] = cockatiels[i];
            }
            result[result.length - 1] = (Cockatiel) animal;
            cockatiels = result;

        } else if (animal instanceof Owl) {
            Owl[] result = new Owl[owls.length + 1];
            for (int i = 0; i < owls.length; i++) {
                result[i] = owls[i];
            }
            result[result.length - 1] = (Owl) animal;
            owls = result;

        } else if (animal instanceof Eagle) {
            Eagle[] result = new Eagle[eagles.length + 1];
            for (int i = 0; i < eagles.length; i++) {
                result[i] = eagles[i];
            }
            result[result.length - 1] = (Eagle) animal;
            eagles = result;
        }
    }

    @Override
    public void printAllZooAnimals() {
        System.out.println("Our birdzoo inhabits the following birds:");
        for (int i = 0; i < cockatiels.length; i++) {
            System.out.println("Species: Cockatiel"  + ";  name: " + cockatiels[i].getName() + ";  sex: " + cockatiels[i].getSex() + ";  weight: " + cockatiels[i].getWeight());
        }
        for (int i = 0; i < eagles.length; i++) {
            System.out.println("Species: Eagle"  + ";  name: " + eagles[i].getName() + ";  sex: " + eagles[i].getSex() + ";  weight: " + eagles[i].getWeight());
        }
        for (int i = 0; i < owls.length; i++) {
            System.out.println("Species: Owl"  + ";  name: " + owls[i].getName() + ";  sex: " + owls[i].getSex() + ";  weight: " + owls[i].getWeight());
        }
    }
}
