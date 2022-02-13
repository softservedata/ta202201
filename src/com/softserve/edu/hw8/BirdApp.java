package com.softserve.edu.hw8;

public class BirdApp {
    public void printSortedBirds() {
        IBird[] birds = this.createBirds();
        this.sortByBirdsName(birds);
        this.printBirds(birds);
    }

    private IBird[] createBirds() {
        IBird[] birds = {
                new Swallow("Ol"),
                new Chicken("Den"),
                new Penguin("Khr"),
                new Eagle("Yul"),
                new Swallow("Yar"),
                new Chicken("And"),
                new Penguin("Ir"),
                new Eagle("Pet"),
        };
        return birds;
    }

    private void sortByBirdsName(IBird[] birds) {
        for (int i = 0; i < birds.length - 1; i++) {
            IBird currentBird = birds[i];
            IBird nextBird = birds[i + 1];

            if (currentBird.compareTo(nextBird) > 0) {
                birds[i + 1] = currentBird;
                birds[i] = nextBird;
                i = -1;
            }
        }
    }

    private void printBirds(IBird[] birds) {
        for (IBird current : birds) {
            System.out.println(current);
        }
    }
}
