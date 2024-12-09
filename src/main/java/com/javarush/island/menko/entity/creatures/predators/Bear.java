package com.javarush.island.menko.entity.creatures.predators;

import com.javarush.island.menko.utils.Config;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Config(filePath = "menko/bear.json")
public class Bear extends Predator{
}
