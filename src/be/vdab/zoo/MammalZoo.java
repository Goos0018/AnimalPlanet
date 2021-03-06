package be.vdab.zoo;

import be.vdab.Animal;
import be.vdab.Mammal;
import be.vdab.mammal.Cow;
import be.vdab.mammal.Monkey;
import be.vdab.mammal.Tiger;

public class MammalZoo extends Zoo {

    private Cow[] cows;
    private Monkey[] monkeys;
    private Tiger[] tigers;

    public MammalZoo() {
        cows = new Cow[0];
        monkeys = new Monkey[0];
        tigers = new Tiger[0];
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Monkey[] getMonkeys() {
        return monkeys;
    }

    public void setMonkeys(Monkey[] monkeys) {
        this.monkeys = monkeys;
    }

    public Tiger[] getTigers() {
        return tigers;
    }

    public void setTigers(Tiger[] tigers) {
        this.tigers = tigers;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (!(animal instanceof Mammal)) {
            System.out.println("this is not a mammal");
            return;
        } else if (animal instanceof Cow) {
            Cow[] result = new Cow[cows.length + 1];
            for (int i = 0; i < cows.length; i++) {
                result[i] = cows[i];
            }
            result[result.length - 1] = (Cow) animal;
            cows = result;

        } else if (animal instanceof Monkey) {
            Monkey[] result = new Monkey[monkeys.length + 1];
            for (int i = 0; i < monkeys.length; i++) {
                result[i] = monkeys[i];
            }
            result[result.length - 1] = (Monkey) animal;
            monkeys = result;

        } else if (animal instanceof Tiger) {
            Tiger[] result = new Tiger[tigers.length + 1];
            for (int i = 0; i < tigers.length; i++) {
                result[i] = tigers[i];
            }
            result[result.length - 1] = (Tiger) animal;
            tigers = result;
        }
    }

    @Override
    public void printAllZooAnimals() {
        System.out.println("Our mammalzoo inhabits the following mammals:");
        for (int i = 0; i < tigers.length; i++) {
            System.out.println("Species: Tiger"  + ";  name: " + tigers[i].getName() + ";  sex: " + tigers[i].getSex() + ";  weight: " + tigers[i].getWeight());
        }
        for (int i = 0; i < monkeys.length; i++) {
            System.out.println("Species: Monkey"  + ";  name: " + monkeys[i].getName() + ";  sex: " + monkeys[i].getSex() + ";  weight: " + monkeys[i].getWeight());
        }
        for (int i = 0; i < cows.length; i++) {
            System.out.println("Species: Cow"  + ";  name: " + cows[i].getName() + ";  sex: " + cows[i].getSex() + ";  weight: " + cows[i].getWeight());
        }
    }

}
