package com.j2.w6.Calc;

import java.awt.Color;
import ch.aplu.turtle.*;

public class WeightTurtle extends Turtle {    protected int weight;
    public WeightTurtle(int w) {
        weight=w;
        setColor(Color.red);
    }
    public int getWeight() {
        return weight;
    }
}