package com.student.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {


    HashMap<Integer,Student> studentHashMap = new HashMap<>();
    HashMap<Integer,Course> courseHashMap = new HashMap<>();


    public void addStudent(Student student){
            int id = student.getId();
            studentHashMap.put(id,student);
    }

    public Student getStudent(Integer id){
        Student student = studentHashMap.get(id);
        return student;
    }

    public void addCourse(Course course){
        int id = course.getCourseId();
        courseHashMap.put(id,course);
    }

    public Course getCourse(Integer id){
        return courseHashMap.get(id);
    }

    public Student get(String name){
        for(Student s : studentHashMap.values()){
            if(s.getName().equals(name)) return s;
        }
        return null;
    }
}
