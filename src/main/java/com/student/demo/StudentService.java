package com.student.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
     studentRepository.addStudent(student);
    }

    public Student getStudent(Integer id){
        return studentRepository.getStudent(id);
    }

    public void addCourse(Course course){
        studentRepository.addCourse(course);
    }

    public Course getCourse(Integer id){
     return studentRepository.getCourse(id);
    }

    public Student get(String name){
        return studentRepository.get(name);
    }
}
