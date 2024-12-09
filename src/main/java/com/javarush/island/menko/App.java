package com.javarush.island.menko;

import com.javarush.island.menko.repository.EntityCreator;
import com.javarush.island.menko.service.*;
import com.javarush.island.menko.view.ConsoleView;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

    public static ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(5);

    public static void main(String[] args) throws InterruptedException {

        EntityCreator entityCreator = new EntityCreator();
        entityCreator.start();
        entityCreator.join();

        StartLifeService startLifeService = new StartLifeService();
        ConsoleView consoleView = new ConsoleView();
        PredatorsDecrementWeightService predatorsDecrementWeightService = new PredatorsDecrementWeightService();
        HerbivoresDecrementWeightService herbivoresDecrementWeightService = new HerbivoresDecrementWeightService();
        PlantsControlWeightService plantsControlWeightService = new PlantsControlWeightService();

        threadPool.scheduleAtFixedRate(startLifeService, 2000, 1, TimeUnit.MICROSECONDS);
        threadPool.scheduleAtFixedRate(consoleView, 1, 2, TimeUnit.SECONDS);
        threadPool.scheduleAtFixedRate(predatorsDecrementWeightService, 1, 1, TimeUnit.MICROSECONDS);
        threadPool.scheduleAtFixedRate(herbivoresDecrementWeightService, 1, 1, TimeUnit.MICROSECONDS);
        threadPool.scheduleAtFixedRate(plantsControlWeightService, 1, 1, TimeUnit.MILLISECONDS);
    }
}
