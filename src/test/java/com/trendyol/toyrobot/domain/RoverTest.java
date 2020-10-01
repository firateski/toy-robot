package com.trendyol.toyrobot.domain;

import static org.junit.jupiter.api.Assertions.*;

import com.trendyol.toyrobot.domain.compass.Direction;
import com.trendyol.toyrobot.domain.compass.East;
import com.trendyol.toyrobot.domain.compass.South;
import com.trendyol.toyrobot.domain.compass.West;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void should_create_rover() {
        Rover rover = createNorthRover();
        assertEquals(0, rover.getLocation().getX());
        assertEquals(0, rover.getLocation().getY());
        assertEquals(Direction.NORTH, rover.getCompass().getDirection());
    }

    @Test
    public void should_move_forward_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.move();
        assertEquals(1, rover.getLocation().getY());
    }

    @Test
    public void should_move_forward_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.move();
        assertEquals(1, rover.getLocation().getX());
    }

    @Test
    public void should_move_forward_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.move();
        assertEquals(-1, rover.getLocation().getY());
    }

    @Test
    public void should_move_forward_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.move();
        assertEquals(-1, rover.getLocation().getX());
    }

    @Test
    public void should_turn_left_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnLeft();
        assertEquals(Direction.WEST, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_left_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnLeft();
        assertEquals(Direction.SOUTH, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_left_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnLeft();
        assertEquals(Direction.EAST, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_left_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnLeft();
        assertEquals(Direction.NORTH, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_right_when_compass_is_north () {
        Rover rover = createNorthRover();
        rover.turnRight();
        assertEquals(Direction.EAST, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_right_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnRight();
        assertEquals(Direction.SOUTH, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_right_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnRight();
        assertEquals(Direction.WEST, rover.getCompass().getDirection());
    }

    @Test
    public void should_turn_right_when_compass_is_west () {
        Rover rover = createWestRover();
        rover.turnRight();
        assertEquals(Direction.NORTH, rover.getCompass().getDirection());
    }

    private Rover createWestRover() {
        return new Rover(0, 0, new West());
    }

    private Rover createSouthRover() {
        return new Rover(0, 0, new South());
    }

    private Rover createEastRover() {
        return new Rover(0, 0, new East());
    }

    private Rover createNorthRover() {
        return new Rover();
    }
}
