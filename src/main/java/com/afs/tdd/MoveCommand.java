package com.afs.tdd;

public class MoveCommand implements MarsRoverCommand{

    private final MarsRover marsRover;

    public MoveCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void executeCommand() {
        marsRover.move();
    }
}
