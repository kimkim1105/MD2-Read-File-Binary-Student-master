package com.company.view;

import java.io.IOException;
import java.util.Scanner;

public class Main {
public Main() throws Exception {
    Scanner scanner = new Scanner(System.in);
    StudentView studentView = new StudentView();
    System.out.println("========================STUDENT MANAGE ================================");
    System.out.println("1. CREATE STUDENT");
    System.out.println("2. SHOW LIST STUDENT");
    System.out.println("3. EDIT STUDENT BY ID");
    System.out.println("4. DELETE STUDENT BY ID");
    System.out.println("5. SEARCH STUDENT BY ID");
    System.out.println("6. SEARCH STUDENT BY NAME");
    int chooseMenu = scanner.nextInt();
    switch (chooseMenu){
        case 1:
           studentView.formCreateStudent();
           break;
        case 2:
            studentView.showListStudent();
            break;
        case 3:
            studentView.editStudent();
            break;
        case 4:
            studentView.deleteStudent();
            break;
        case 5:
            studentView.searchStudent();
            break;
        case 6:
            studentView.searchStudentByName();
    }
}
    public static void main(String[] args) throws Exception {
	// write your code here
        new Main();
    }
}
