package com.student.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //adding student
    @PostMapping("/add-student")
    public void addStudent(@RequestBody() Student student){
        studentService.addStudent(student);
    }

    //get Student By ID
    @GetMapping("/get-student")
    public Student getStudent(@RequestParam("id") Integer id){
        return studentService.getStudent(id);
    }

    //adding course
    @PostMapping("/add-course")
    public void addCourse(@RequestBody() Course course){
        studentService.addCourse(course);
    }

    //get Course
    @GetMapping("/get-course")
    public Course getCourse(@RequestParam("id") Integer id){
        Course course = studentService.getCourse(id);
        return course;
    }

    @GetMapping("/find-by-name/{Student}")
    public Student getCourse(@PathVariable() String name){
        Student Student = studentService.get(name);
        return Student;
    }
}
