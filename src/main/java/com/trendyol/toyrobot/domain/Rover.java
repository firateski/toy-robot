package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.compass.Compass;
import com.trendyol.toyrobot.domain.compass.Location;
import com.trendyol.toyrobot.domain.compass.North;

public class Rover {

    private Location location;
    private Compass compass;

    public Rover() {
        this.location = new Location(0, 0);
        this.compass = new North();
    }

    public Rover(int x, int y, Compass compass) {
        location = new Location(x, y);
        this.compass = compass;
    }

    public void move() {
        location = compass.move(location);
    }

    public void turnLeft() {
        this.compass = compass.turnLeft();
    }

    public void turnRight() {
        this.compass = compass.turnRight();
    }

    public Compass getCompass() {
        return this.compass;
    }

    public Location getLocation(){
        return location;
    }
}
