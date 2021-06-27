package com.allisterquinn;

public class Ability {
    private String name = "undefined";
    private int level = 0;

    public Ability(String name, int level) {
        this.name = name;
        this.level = level;
    }
    public void Use () {
        System.out.println( "Using level + " + level + " ability " + name);
    }

    public String toString() {
        return name + " (" + level + ")";
    }
    public String getName() {
        return name;
    }
}