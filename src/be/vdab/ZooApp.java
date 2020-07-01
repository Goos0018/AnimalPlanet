package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.mammal.Tiger;
import be.vdab.zoo.BirdZoo;
import be.vdab.zoo.MammalZoo;
import be.vdab.zoo.Zoo;

public class ZooApp {
    public static void main(String[] args) {
        BirdZoo paradisio = new BirdZoo();
        Cockatiel parkiet = new Cockatiel();
        parkiet.setName("Parkiet");
        paradisio.addAnimal(parkiet);


        MammalZoo plankendael = new MammalZoo();
        Tiger tigres = new Tiger(true, 4);
        tigres.setName("Tigres");
        paradisio.addAnimal(tigres);
        paradisio.printAnimal();



    }
}
