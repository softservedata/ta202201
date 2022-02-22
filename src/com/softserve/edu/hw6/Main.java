package com.softserve.edu.hw6;

public class Main {

    public static void main(String[] args) {

        Developer[] developers = {
                new Developer("Jill" , 23, "Java Dev"),
                new Developer("Albert", 34, "Java Dev"),
                new Developer("Chris", 25, "Java Dev"),
                new Developer("Leon", 21, "Python Dev"),
                new Developer("Ada", 32, "Ruby Dev")
        };

        Developer youngestJavaDeveloper = new Developer();

        for (Developer dev : developers){
            if (dev.getDirection().equals("Java Dev")){
                youngestJavaDeveloper = dev;
                break;
            }
        }

        System.out.println("List of devs: ");

        for (Developer developer : developers) {
            System.out.println(developer);
            if (developer.getDirection().equals("Java Dev")) {
                if (developer.getAge() < youngestJavaDeveloper.getAge()) {
                    youngestJavaDeveloper = developer;
                }
            }
        }

        System.out.println('\n' + "Youngest JAVA Developer is: " + youngestJavaDeveloper.getName());

    }

}