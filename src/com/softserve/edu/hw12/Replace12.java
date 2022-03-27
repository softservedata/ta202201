package com.softserve.edu.hw12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Replace12 {
    public static void main(String[] args) throws IOException {
        // writing a text into a file
        String fileName = "C:\\Users\\opyvo\\OneDrive - SoftServe, Inc\\IdeaProjects\\ta202201\\src\\com\\softserve\\edu\\hw12\\file.txt";
        String fileNew = "C:\\Users\\opyvo\\OneDrive - SoftServe, Inc\\IdeaProjects\\ta202201\\src\\com\\softserve\\edu\\hw12\\fileNew.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        String data = "Welcome! This is your new house. Welcome home!";
        //   */
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // reading text from the file to a List
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String fileText = null;
        List<String> fileList = new ArrayList<>();
        while ((fileText = br.readLine()) != null) {
            fileList.add(fileText);
        }
        br.close();
        // replace
        List<String> fileList2 = new ArrayList<>();
        String s;
        for (int i = 0; i < fileList.size(); i++) {
            s = fileList.get(i);
            s = s.replace("Welcome", "Hello");
            fileList2.add(s);
        }
        // re-writing a file from List_2
        try {
            fw = new FileWriter(fileNew);
            bw = new BufferedWriter(fw);
            bw.write(String.valueOf(fileList2));
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
