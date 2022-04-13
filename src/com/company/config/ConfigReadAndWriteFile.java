package com.company.config;

import com.company.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile {
    public static List<Student> readFromFile(String path){
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return studentList;
    }
    public static void writeToFile(String path, List<Student> studentList) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
