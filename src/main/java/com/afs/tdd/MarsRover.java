package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command... givenCommands) {
        Arrays.stream(givenCommands).forEachOrdered(givenCommand -> {
            if (givenCommand == Command.MOVE) {
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

            if (givenCommand == Command.TURN_LEFT) {
                if (location.getDirection() == Direction.NORTH) {
                    location.setDirection(Direction.WEST);
                } else if (location.getDirection() == Direction.SOUTH) {
                    location.setDirection(Direction.EAST);
                } else if (location.getDirection() == Direction.EAST) {
                    location.setDirection(Direction.NORTH);
                } else if (location.getDirection() == Direction.WEST) {
                    location.setDirection(Direction.SOUTH);
                }
            }

            if (givenCommand == Command.TURN_RIGHT) {
                if (location.getDirection() == Direction.WEST) {
                    location.setDirection(Direction.NORTH);
                } else if (location.getDirection() == Direction.EAST) {
                    location.setDirection(Direction.SOUTH);
                } else if (location.getDirection() == Direction.NORTH) {
                    location.setDirection(Direction.EAST);
                } else if (location.getDirection() == Direction.SOUTH) {
                    location.setDirection(Direction.WEST);
                }
            }
        });
    }

    public Location getCurrentLocation() {
        return location;
    }
}
