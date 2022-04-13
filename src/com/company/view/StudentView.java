package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;
import com.company.service.StudentServiceIMPL;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = StudentServiceIMPL.studentList;
    StudentController studentController = new StudentController();
    public void showListStudent() throws Exception {
//        System.out.println(studentList);
        System.out.println(studentController.showListStudent());
//        System.out.println("Enter quit to come back Menu");
//        String backMenu = scanner.nextLine();
//        if(backMenu.equalsIgnoreCase("quit")){
//
//        }
        new Main();
    }
    public void formCreateStudent() throws Exception {
      while (true){
          int id;
          if(studentList.size()==0){
              id = 1;
          } else {
              id = studentList.get(studentList.size()-1).getId()+1;
          }
          System.out.println("Enter the name Student: ");
          String name = scanner.nextLine();
          System.out.println("Enter the age Student: ");
          int age = Integer.parseInt(scanner.nextLine());
          Student student = new Student(id,name,age);
          studentController.createStudent(student);
          System.out.println("Enter any key to continue create Student or Enter quit to come back Menu");
          String backMenu = scanner.nextLine();
          if(backMenu.equalsIgnoreCase("quit")){
              new Main();
          }
      }

    }
    public void editStudent() throws Exception {
        System.out.println("Enter Student'id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name, enter skip if no change: ");
        String name = scanner.nextLine();
        System.out.println("Enter new age, enter skip if no change: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (name.equals("skip")){
            if (String.valueOf(age)!="skip")
            for (int i = 0; i < studentList.size(); i++) {
                if (id==studentList.get(i).getId())
                    name = studentList.get(i).getName();
            }
        }else if (String.valueOf(age).equals("skip")){
            for (int i = 0; i < studentList.size(); i++) {
                if (id==studentList.get(i).getId())
                    age = studentList.get(i).getAge();
            }
        }
        studentController.editStudent(id,name,age);
        showListStudent();
            new Main();
    }
    public void deleteStudent() throws Exception{
        System.out.println("Enter Student'id: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentController.deleteStudent(id);
        showListStudent();
        new Main();
    }
    public void searchStudent() throws Exception{
        System.out.println("Enter Student'id: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentController.searchStudent(id);
        new Main();
    }
    public void searchStudentByName() throws Exception{
        System.out.println("Enter Student'name: ");
        String name = scanner.nextLine();
        studentController.searchStudentByName(name);
        new Main();
    }
}
