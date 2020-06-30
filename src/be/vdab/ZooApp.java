package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.zoo.BirdZoo;

public class ZooApp {
    public static void main(String[] args) {
        BirdZoo paradisio = new BirdZoo();
        Cockatiel parkiet = new Cockatiel();
        parkiet.setName("Parkiet");
        paradisio.addAnimal(parkiet);

        for (Cockatiel element : paradisio.getCockatiels()) {
            System.out.println(element.getName());
        }

    }
}
