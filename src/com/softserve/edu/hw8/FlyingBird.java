package com.softserve.edu.hw8;

public abstract class FlyingBird implements IBird {
    private final boolean canFly;

    protected FlyingBird() {
        this.canFly = true;
    }

    public boolean isFly() {
        return this.canFly;
    }
}
