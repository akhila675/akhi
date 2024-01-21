// Write your code here
package com.example.school.repository;

import com.example.school.model.Student;
import java.util.*;

public interface StudentRepository {
    ArrayList<Student> getStudenta();

    Student addStudent(Student student);

    String addMultipleStudent(ArrayList<Student> studentList);

    Student updateStudent(int studentId, Student student);

    void deleteStuednt(int studentId);
}