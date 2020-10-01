package com.trendyol.toyrobot.domain.compass;

public interface Compass {
    Location move(Location currentLocation);

    Compass turnLeft();

    Compass turnRight();

    Direction getDirection();
}
