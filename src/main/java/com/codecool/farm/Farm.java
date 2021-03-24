package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import java.util.ArrayList;
import java.util.List;

class Farm {

    private final List<Animal> ANIMALS;

    public Farm(List<Animal> animals) {
        this.ANIMALS = animals;
    }

    public void feedAnimals() {
        ANIMALS.forEach(Animal::feed);
    }

    public void butcher(Butcher butcher) {
        ANIMALS.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return ANIMALS.isEmpty();
    }

    public List<String> getStatus() {
        List<String> listToReturn = new ArrayList<>();
        for (Animal actualAnimal : ANIMALS) {
            listToReturn.add("There is a " + actualAnimal.getSize() + " sized " +
                    actualAnimal.getClass().getSimpleName().toLowerCase() + " in the farm.");
        }
        return listToReturn;
    }

    public List<Animal> getAnimals() {
        return ANIMALS;
    }

}