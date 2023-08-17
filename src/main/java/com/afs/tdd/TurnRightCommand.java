package com.afs.tdd;

public class TurnRightCommand implements MarsRoverCommand {
    private final MarsRover marsRover;

    public TurnRightCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void executeCommand() {
        marsRover.turnRight();
    }
}
