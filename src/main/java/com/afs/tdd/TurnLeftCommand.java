package com.afs.tdd;

public class TurnLeftCommand implements MarsRoverCommand {
    private final MarsRover marsRover;

    public TurnLeftCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void executeCommand() {
        marsRover.turnLeft();
    }
}
