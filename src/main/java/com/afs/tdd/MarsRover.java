package com.afs.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private Location location;

    private static Map<Direction, Direction> DIRECTION_PAIR_MAP = new HashMap<>();

    static {
        DIRECTION_PAIR_MAP.put(Direction.NORTH, Direction.WEST);
        DIRECTION_PAIR_MAP.put(Direction.SOUTH, Direction.EAST);
        DIRECTION_PAIR_MAP.put(Direction.EAST, Direction.NORTH);
        DIRECTION_PAIR_MAP.put(Direction.WEST, Direction.SOUTH);
    }

    public MarsRover(Location location) {
        this.location = location;
    }

    public void move() {
        switch (location.getDirection()) {
            case NORTH:
                location.incrementY();
                break;
            case SOUTH:
                location.decrementY();
                break;
            case EAST:
                location.incrementX();
                break;
            case WEST:
                location.decrementX();
                break;
        }
    }

    public void turnLeft() {
        location.setDirection(DIRECTION_PAIR_MAP.get(location.getDirection()));
    }

    public void turnRight() {
        DIRECTION_PAIR_MAP.entrySet().stream()
                .filter(directionDirectionEntry -> directionDirectionEntry.getValue().equals(location.getDirection()))
                .findFirst()
                .map(Map.Entry::getKey)
                .ifPresent(direction -> location.setDirection(direction));
    }

    public Location getCurrentLocation() {
        return location;
    }
}
