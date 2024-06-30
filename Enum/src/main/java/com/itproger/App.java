package com.itproger;

public class App
{
    public static void main( String[] args ) {

        for (SolarSystem planet : SolarSystem.values()) {
            System.out.println("Planet: " + planet.name());
            System.out.println("Order from Sun: " + planet.getOrderFromSun());
            System.out.println("Previous Distance: " + planet.getPrevDistance());
            System.out.println("Distance from Sun: " + planet.getDistanceFromSun());
            System.out.println("Radius: " + planet.getRadius());
            System.out.println("Previous Planet: " + (planet.getPrevious() != null ? planet.getPrevious().name() : "None"));
            System.out.println("Next Planet: " + (planet.getNext() != null ? planet.getNext().name() : "None"));
            System.out.println();
        }

    }
}
