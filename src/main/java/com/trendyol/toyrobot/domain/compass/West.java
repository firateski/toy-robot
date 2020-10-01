package com.trendyol.toyrobot.domain.compass;

public class West implements Compass {
    @Override
    public Location move(Location currentLocation) {
        return currentLocation.moveLeft();
    }

    @Override
    public Compass turnLeft() {
        return new South();
    }

    @Override
    public Compass turnRight() {
        return new North();
    }

    @Override
    public Direction getDirection() {
        return Direction.WEST;
    }
}
