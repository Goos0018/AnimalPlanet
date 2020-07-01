package be.vdab.zoo;

import be.vdab.Animal;
import be.vdab.Protozoa;
import be.vdab.protozoa.Amoeba;
import be.vdab.protozoa.Malaria;

public class ProtozoaZoo extends Zoo {

    Amoeba[] amoebas;
    Malaria[] malarias;

    public ProtozoaZoo() {
        amoebas = new Amoeba[0];
        malarias = new Malaria[0];
    }

    public Amoeba[] getAmoebas() {
        return amoebas;
    }

    public void setAmoebas(Amoeba[] amoebas) {
        this.amoebas = amoebas;
    }

    public Malaria[] getMalarias() {
        return malarias;
    }

    public void setMalarias(Malaria[] malarias) {
        this.malarias = malarias;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (!(animal instanceof Protozoa)) {
            System.out.println("this is not a protozoa");
            return;
        } else if (animal instanceof Amoeba) {
            Amoeba[] result = new Amoeba[amoebas.length + 1];
            for (int i = 0; i < amoebas.length; i++) {
                result[i] = amoebas[i];
            }
            result[result.length - 1] = (Amoeba) animal;
            amoebas = result;

        } else if (animal instanceof Malaria) {
            Malaria[] result = new Malaria[malarias.length + 1];
            for (int i = 0; i < malarias.length; i++) {
                result[i] = malarias[i];
            }
            result[result.length - 1] = (Malaria) animal;
            malarias = result;
        }
    }

    @Override
    public void printAnimal() {

    }
}
