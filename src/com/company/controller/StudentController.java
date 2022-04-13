package com.company.controller;

import com.company.model.Student;
import com.company.service.StudentServiceIMPL;

import java.io.IOException;
import java.util.List;

public class StudentController {
    StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
    public List<Student> showListStudent() throws IOException {
         return studentServiceIMPL.findAll();
    }
    public void createStudent(Student student) throws IOException {
        studentServiceIMPL.save(student);
    }
    public void editStudent(int id, String name, int age) throws Exception{
        studentServiceIMPL.edit(id,name,age);
    }
    public void deleteStudent(int id)throws Exception{
        studentServiceIMPL.delete(id);
    }
    public void searchStudent(int id) throws Exception {
        studentServiceIMPL.search(id);
    }
    public void searchStudentByName(String name) throws Exception {
        studentServiceIMPL.searchByName(name);
    }
}
