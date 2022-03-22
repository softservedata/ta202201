package com.softserve.edu.hw12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileAppImp implements FileApp{
    String fileName;

    public FileAppImp(String fileName) {
        this.fileName = fileName;
    }

    public void replaceTextInFile(){
        try {
            String textToChange = "Welcome";
            String changedText = "Hello";

            ArrayList<String> fileReplacedLines = this.replaceReadFileData(textToChange, changedText);
            this.writeReplacedLines(fileReplacedLines);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private ArrayList<String> replaceReadFileData(String textToChange, String changedText) throws IOException {
        ArrayList<String> fileReplacedLines = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(this.fileName));
        String primaryFileContent;

        while ((primaryFileContent = br.readLine()) != null) {
            String finalFileContent = primaryFileContent.replace(textToChange, changedText);
            fileReplacedLines.add(finalFileContent);
        }

        br.close();

        return fileReplacedLines;
    }

    private void writeReplacedLines(ArrayList<String> fileReplacedLines) throws IOException{
        FileWriter fileWriter = new FileWriter(this.fileName);
        String newLineSymbol = "\n";

        for (String elements : fileReplacedLines) {
            fileWriter.write(elements + newLineSymbol);
        }
        fileWriter.close();
    }
}
