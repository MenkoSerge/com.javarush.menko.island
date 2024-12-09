package com.javarush.island.menko.entity.creatures.plants;

import com.javarush.island.menko.entity.creatures.Plant;
import com.javarush.island.menko.utils.Config;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Config(filePath = "menko/grass.json")
public class Grass extends Plant {
}

