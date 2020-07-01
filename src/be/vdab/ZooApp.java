package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.bird.Eagle;
import be.vdab.bird.Owl;
import be.vdab.mammal.Cow;
import be.vdab.mammal.Dog;
import be.vdab.mammal.Tiger;
import be.vdab.protozoa.Malaria;
import be.vdab.zoo.BirdZoo;
import be.vdab.zoo.MammalZoo;
import be.vdab.zoo.ProtozoaZoo;

public class ZooApp {
    public static void main(String[] args) {

        // Create 3 new zoo's
        MammalZoo plankendael = new MammalZoo();
        BirdZoo paradisio = new BirdZoo();
        ProtozoaZoo microscopia = new ProtozoaZoo();

        // Create animals for the zoo
        Cockatiel parkiet = new Cockatiel();
        Owl oehoe = new Owl();
        Eagle baldy = new Eagle();
        Cow bella = new Cow(false, 4);
        Tiger tigres = new Tiger(true, 4);
        Malaria moquito = new Malaria();

        // Set some of the parameters of the animals
        parkiet.setName("Parkiet");
        oehoe.setName("Oehoe");
        oehoe.setCanFly(true);
        oehoe.setSex("Male");
        baldy.setName("Baldy");
        baldy.setWeight(5);
        bella.setHasHorns(true);
        bella.setName("Bella");
        tigres.setName("Tigres");
        tigres.setDiet(Animal.Diet.CARNIVORE);
        moquito.setSex("X");

        // Add created animals to correct zoo
        paradisio.addAnimal(parkiet);
        paradisio.addAnimal(oehoe);
        paradisio.addAnimal(baldy);
        plankendael.addAnimal(tigres);
        plankendael.addAnimal(bella);
        microscopia.addAnimal(moquito);

        //print all the animals in the zoo
        paradisio.printAllZooAnimals();
        plankendael.printAllZooAnimals();
        microscopia.printAllZooAnimals();

        // Create a dog
        Dog fifi = new Dog();
        // print the reactions to some commands
        System.out.println(fifi.react(Dog.Commands.BEG));
        System.out.println(fifi.react(Dog.Commands.CHASE));
        System.out.println(fifi.react(Dog.Commands.SPEAK));

    }
}
