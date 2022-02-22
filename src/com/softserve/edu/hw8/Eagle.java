package com.softserve.edu.hw8;

public class Eagle extends FlyingBird implements Bird{
    String name;
    public Eagle(String Eagle) {this.name=Eagle;}
    @Override
    public String getName(){ return name; }
    @Override
    public String toString() { return "\nthe bird is " + getName() + ". Does it fly? " + isFly();}
    @Override
    //public int compareTo (Bird birds) {return  this.getName().compareTo(birds.getName());}  //this works as well
    public int compareTo (Bird birds) {return  name.compareTo(birds.getName());}
}
