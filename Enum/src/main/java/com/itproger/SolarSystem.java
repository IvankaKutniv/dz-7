package com.itproger;

public enum SolarSystem {

    MERCURY(0, 2440, null),
    VENUS(50, 6052, MERCURY),
    EARTH(41, 6371, VENUS),
    MARS(78, 3389, EARTH),
    JUPITER(550, 69911, MARS),
    SATURN(650, 58232, JUPITER),
    URANUS(900, 25362, SATURN),
    NEPTUNE(1000, 24622, URANUS);

    private int orderFromSun;
    private int prevDistance;
    private int distanceFromSun;
    private int radius;
    private SolarSystem previous;
    private SolarSystem next;

    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.previous = previous;
        this.orderFromSun = previous == null ? 1 : previous.orderFromSun + 1;
        this.distanceFromSun = previous == null ? 0 : previous.distanceFromSun + prevDistance;

        // Set the next planet for the previous one
        if (previous != null) {
            previous.next = this;
        }

        // Initialize the next planet as null
        this.next = null;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getPrevDistance() {
        return prevDistance;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPrevious() {
        return previous;
    }

    public SolarSystem getNext() {
        return next;
    }


}
