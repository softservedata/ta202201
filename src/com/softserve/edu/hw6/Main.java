package com.softserve.edu.hw6;

public class Main {

    public static void main(String[] args) {

        Developer[] developers = {
                new Developer("Ivan" , 23, "Ruby Dev"),
                new Developer("Alex", 43, "PHP Dev"),
                new Developer("Roman", 31, "Java Dev"),
                new Developer("Inna", 30, "Java Dev"),
                new Developer("Petro", 19, "Phyton Dev")
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
