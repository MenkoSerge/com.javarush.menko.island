package com.javarush.island.menko.service;

import com.javarush.island.menko.constants.Constants;
import com.javarush.island.menko.entity.creatures.Organism;
import com.javarush.island.menko.entity.creatures.herbivores.*;
import com.javarush.island.menko.entity.map.Cell;
import com.javarush.island.menko.repository.EntityCreator;

public class HerbivoresDecrementWeightService extends Thread {

    public static int deadCounter = 0;

    @Override
    public void run() {
        decrementWeight();
    }

    public void decrementWeight() {
        for (Cell[] row : EntityCreator.gameMap.getCells()) {
            for (Cell cell : row) {
                for (Organism organism : cell.getOrganisms()) {
                    if (organism instanceof Herbivore) {
                        organism.setWeight(organism.getWeight() - organism.getCriticalWeight() * Constants.PERCENT_DECREMENT_WEIGHT_FOR_ANIMAL);
                        if (organism.getWeight() < organism.getCriticalWeight()) {
                            cell.getOrganisms().remove(organism);
                            deadCounter++;
                        }
                    }
                }
            }
        }
    }
}