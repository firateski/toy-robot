package com.trendyol.toyrobot.domain.compass;

public interface Compass {
    Location move(Location currentPosition);

    Compass turnLeft();

    Compass turnRight();

    Direction getDirection();
}
