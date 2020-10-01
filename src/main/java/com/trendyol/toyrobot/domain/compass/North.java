package com.trendyol.toyrobot.domain.compass;

public class North implements Compass {
    @Override
    public Location move(Location currentLocation) {
        return currentLocation.moveTop();
    }

    @Override
    public Compass turnLeft() {
        return new West();
    }

    @Override
    public Compass turnRight() {
        return new East();
    }

    @Override
    public Direction getDirection() {
        return Direction.NORTH;
    }
}
