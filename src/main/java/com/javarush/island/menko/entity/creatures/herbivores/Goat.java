package com.javarush.island.menko.entity.creatures.herbivores;

import com.javarush.island.menko.utils.Config;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@Config(filePath = "menko/goat.json")
public class Goat extends Herbivore{
}
