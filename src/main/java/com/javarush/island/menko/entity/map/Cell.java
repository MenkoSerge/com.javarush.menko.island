package com.javarush.island.menko.entity.map;

import com.javarush.island.menko.entity.creatures.Organism;
import lombok.Data;
import lombok.ToString;

import java.util.concurrent.CopyOnWriteArrayList;

@Data
@ToString
public class Cell {

    private int id;
    private CopyOnWriteArrayList<Organism> organisms;
    private int row;
    private int col;
}
