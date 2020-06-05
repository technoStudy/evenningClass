package day49.tasks.task1.vehicles;

import day49.tasks.task1.interfaces.Sailing;
import day49.tasks.task1.interfaces.Vehicle;

public class Ship implements Vehicle, Sailing {
    @Override
    public String sail() {
        return "river, ocean, sea";
    }

    @Override
    public int speed() {
        return 15;
    }
}
