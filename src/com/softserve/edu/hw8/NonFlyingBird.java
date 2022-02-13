package com.softserve.edu.hw8;

public abstract class NonFlyingBird implements IBird {
    private final boolean canFly;

    protected NonFlyingBird() {
        this.canFly = false;
    }

    public boolean isFly() {
        return this.canFly;
    }
}
