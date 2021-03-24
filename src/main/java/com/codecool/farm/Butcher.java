package com.codecool.farm;

import com.codecool.farm.animal.Animal;

class Butcher {

    private final int GROWING_SIZE = 4;

    public boolean canButcher(Animal animal) {
        return animal.getSize() > GROWING_SIZE;
    }

}