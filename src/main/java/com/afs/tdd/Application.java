package com.afs.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Application {
    private final Map<Command, MarsRoverCommand> marsRoverCommandMap = new HashMap<>();

    public Application(MarsRover marsRover) {
        marsRoverCommandMap.put(Command.MOVE, new MoveCommand(marsRover));
        marsRoverCommandMap.put(Command.TURN_LEFT, new TurnLeftCommand(marsRover));
        marsRoverCommandMap.put(Command.TURN_RIGHT, new TurnRightCommand(marsRover));
    }

    public void commandMarsRover(Command... commands) {
        Arrays.stream(commands)
                .forEach(command -> marsRoverCommandMap.get(command).executeCommand());
    }
}
