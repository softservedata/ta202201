package com.softserve.edu.hw8;

public class Swallow extends FlyingBird implements Bird{
    String name;
    public Swallow (String Swallow) {this.name=Swallow;}
    @Override
    public String getName(){ return name; }
    @Override
    public String toString() { return "\nthe bird is " + getName() + ". Does it fly? " + isFly();}
    @Override
    public int compareTo (Bird birds) {return  name.compareTo(birds.getName());}

}