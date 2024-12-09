package com.javarush.island.menko.entity.creatures.predators;

import com.javarush.island.menko.utils.Config;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Config(filePath = "menko/eagle.json")
public class Eagle extends Predator{
}
