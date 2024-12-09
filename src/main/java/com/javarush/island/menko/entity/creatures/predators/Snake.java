package com.javarush.island.menko.entity.creatures.predators;

import com.javarush.island.menko.utils.Config;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Config(filePath = "menko/snake.json")
public class Snake extends Predator{
}