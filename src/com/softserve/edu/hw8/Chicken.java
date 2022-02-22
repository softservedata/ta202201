package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird implements Bird{
    String name;
    public Chicken(String name) {this.name=name;}
    @Override
    public String getName(){ return name; }
    @Override
    public String toString() { return "\nthe bird is " + getName() + ". Does it fly? " + isFly();}
    @Override
    public int compareTo (Bird birds) {return  name.compareTo(birds.getName());}

}