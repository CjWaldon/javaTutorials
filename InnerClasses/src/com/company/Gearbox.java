package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public Gearbox(int maxGears) {
        this.gears = new ArrayList<>();;
        this.maxGears = maxGears;
        this.currentGear = currentGear;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;

        }

        public double driveSpeed(int revs){
            return revs *(this.ratio);
        }
    }
}
