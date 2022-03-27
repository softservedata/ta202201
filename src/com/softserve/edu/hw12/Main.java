package com.softserve.edu.hw12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/com/softserve/edu/hw12/file.txt";
        String searchString = "Welcome";
        String replaceString = "Hello";
        Path path = Paths.get(filePath);
        try {
            Files.writeString(path, Files.readString(path).replace(searchString, replaceString));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
