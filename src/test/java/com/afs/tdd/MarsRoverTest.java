package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_North_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_N_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_Negative_1_S_when_executeCommand_given_0_0_South_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(-1 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_South_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_South_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_1_0_E_when_executeCommand_given_0_0_East_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(1 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_East_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_East_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_Negative_1_0_W_when_executeCommand_given_0_0_West_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_Negative_0_0_West_and_command_Turn_Left() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_West_and_command_Turn_Right() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_Negative_1_1_N_given_location_0_0_N_when_execute_command_M_L_M_R(){
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        Application marsRoverApplication = new Application(marsRover);
        // When
        marsRoverApplication.commandMarsRover(Command.MOVE
                , Command.TURN_LEFT
                , Command.MOVE
                , Command.TURN_RIGHT);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1 , currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
}
