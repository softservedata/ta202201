package com.softserve.edu.hw6;

public class Developer extends Person{
    private String direction;

    public Developer(String direction) {
        this.direction = "";
    }

    public Developer(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }

    public Developer() {
        this.direction = "";
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public static Developer getMinAgeDev(Developer[] developers) {
        int minDevId = 0;
        int minAge = 0;

        for (int i = 0; i < developers.length - 1; i++){
            if (minAge == 0) {
                    minAge = developers[i].getAge();
                }
                if (minAge > developers[i].getAge()) {
                    minAge = developers[i].getAge();
                    minDevId = i;
                }
        }
        return developers[minDevId];
    }
}
