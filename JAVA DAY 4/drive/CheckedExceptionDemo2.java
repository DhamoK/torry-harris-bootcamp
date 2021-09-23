package com.torryharris.drive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo2 {
    public static void main(String[] args){
        try{
            readFromFile("input.txt");
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    private static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
    }
}
