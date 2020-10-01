package com.trendyol.toyrobot.domain.compass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private int X;
    private int Y;

    public Location(int x, int y){
        this.X = x;
        this.Y = y;
    }
}
