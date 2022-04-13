package com.company.service;

import com.company.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    List<Student> findAll() throws IOException;
    void save(Student student) throws IOException;
}
