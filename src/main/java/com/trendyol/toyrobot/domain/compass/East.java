package com.trendyol.toyrobot.domain.compass;

public class East implements Compass {

    @Override
    public Location move(Location currentPosition) {
        return currentPosition.moveRight();
    }

    @Override
    public Compass turnLeft() {
        return new North();
    }

    @Override
    public Compass turnRight() {
        return new South();
    }

    @Override
    public Direction getDirection() {
        return Direction.EAST;
    }
}
