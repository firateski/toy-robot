package com.trendyol.toyrobot.domain.compass;

public class South implements Compass {
    @Override
    public Location move(Location currentPosition) {
        return new Location(currentPosition.getX(), currentPosition.getY() - 1);
    }

    @Override
    public Compass turnLeft() {
        return new East();
    }

    @Override
    public Compass turnRight() {
        return new West();
    }

    @Override
    public Direction getDirection() {
        return Direction.SOUTH;
    }
}
