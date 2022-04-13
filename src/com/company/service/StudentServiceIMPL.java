package com.company.service;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    public static String PATH = "D:\\java\\LY THUYET\\MODULE 2\\MD2-Read-File-Binary-Error-master\\src\\com\\company\\data\\student.txt";
    public static List<Student> studentList = ConfigReadAndWriteFile.readFromFile(PATH);

    @Override
    public List<Student> findAll() throws IOException {
        return studentList;
    }

    @Override
    public void save(Student student) throws IOException {
        studentList.add(student);
        ConfigReadAndWriteFile.writeToFile(PATH, studentList);
    }

    public void edit(int id, String name, int age) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                studentList.get(i).setName(name);
                studentList.get(i).setAge(age);
            }
        }
        ConfigReadAndWriteFile.writeToFile(PATH, studentList);
    }
    public void delete(int id) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                studentList.remove(i);
            }
        }
        ConfigReadAndWriteFile.writeToFile(PATH, studentList);
    }
    public void search(int id)throws Exception{
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                System.out.println(studentList.get(i));
            }
        }
    }
    public void searchByName(String name)throws Exception{
        List<Student> searchList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)){
                searchList.add(studentList.get(i));
            }
        }
        System.out.println(searchList);
    }
}
